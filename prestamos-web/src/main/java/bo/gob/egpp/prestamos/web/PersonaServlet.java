package bo.gob.egpp.prestamos.web;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import bo.gob.egpp.prestamos.model.Persona;
import bo.gob.egpp.prestamos.services.PersonaService;


import org.springframework.web.context.support.WebApplicationContextUtils;



/**
 * Servlet implementation class PersonaServlet
 */
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Autowired
    PersonaService personaService;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			String operacion = request.getParameter("op");
			if(operacion == null) {
				response.getWriter().append("Debe indicar en el QueryString el tipo de operación (CRUD) y los otros atributos de ser necesarios").append("<br />");
				response.getWriter().append("Ejemplo de listado: ?op=R<br />");
				response.getWriter().append("Ejemplo de creacion: ?op=C&cinit=ValorDelNit&razonsocial=ValorRazonSocial<br />");
				response.getWriter().append("Ejemplo de actualización: ?op=U&cinit=NuevoValorDelNit&razonsocial=NuevoValorRazonSocial&id=IdAActualizar<br />");
				response.getWriter().append("Ejemplo de borrado: ?op=D&id=IdAEliminar<br />");
				return;
			}
			
			WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext()). getAutowireCapableBeanFactory().autowireBean(this);
		
			StringBuilder str = new StringBuilder();
						
			if ("R".equals(operacion))
			{
				List<Persona> personas = personaService.list();
				str.append("<table border=\"1\"><tr><th>ID</th><th>CI</th><th>Nombres</th></tr>");
				for(Persona persona:personas) {
					str.append("<tr><td>")
					.append(persona.getId())
					.append("</td><td>")
					.append(persona.getCi())
					.append("</td><td>")
					.append(persona.getNombres())
					.append("</td></tr>");
				}
				str.append("</table>");
			}
							
			if ("C".equals(operacion))
			{
				String ci = request.getParameter("ci");
				String nombres = request.getParameter("nombres");
				String apellido1 = request.getParameter("apellido1");
				String apellido2 = request.getParameter("apellido2");
				//String fechaNacimiento = request.getParameter("Fec Nac");
				
				Persona persona =new Persona();
				persona.setCi(Integer.parseInt(ci));
				persona.setNombres(nombres);
				persona.setApellido1(apellido1);
				persona.setApellido2(apellido2);
				//persona.setFechaNacimiento(Date.parse(fechaNacimiento) );
				persona = personaService.persist(persona);
				str.append("Se guardo correctamente " + persona.getId());
				
			}
			
			if ("U".equals(operacion))
			{
				String ci = request.getParameter("Ci");
				String nombres = request.getParameter("Nombres");
				String apellido1 = request.getParameter("Apellido1");
				String apellido2 = request.getParameter("Apellido2");
				String id = request.getParameter("id");
				
				Persona persona =new Persona();
				persona.setCi(Integer.parseInt(ci));
				persona.setNombres(nombres);
				persona.setApellido1(apellido1);
				persona.setApellido2(apellido2);
				persona.setId(Integer.parseInt("id"));
				
				persona = personaService.persist(persona);
				str.append("Se actualizado correctamente " + persona.getId());
				
			}
			if ("D".equals(operacion))
			{
				
				String id = request.getParameter("id");
				personaService.delete(Integer.parseInt("id"));			
				str.append("Se borro correctamente ");
				
			}
			response.getWriter().append(str.toString());
			
		}
		catch (Exception e) {
		response.getWriter().append("Error: " + e.getMessage());
		e.printStackTrace(response.getWriter());
		}
	}

}
