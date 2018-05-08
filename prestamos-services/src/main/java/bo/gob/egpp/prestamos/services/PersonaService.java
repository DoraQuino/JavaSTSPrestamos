package bo.gob.egpp.prestamos.services;
import bo.gob.egpp.prestamos.model.Persona;
import java.util.*;

public interface PersonaService {
	// devuelve una persona
	Persona get(Integer id);
	
	//devuelve un listado de personas
	List<Persona> list();
	
	//baja de una persona
	void delete (Integer id);
	
	//Realiza la Alta(insert) de una nueva persona o la Actualizacion(update) de una persona
	Persona persist(Persona persona);
	

}
