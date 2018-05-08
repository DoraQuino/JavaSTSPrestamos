package bo.gob.egpp.prestamos.model;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.*;

@Entity
@Table(name="PERSONA")

public class Persona {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="CI",nullable=false,unique=true)
	private int ci;
	
	@Column(name="NOMBRES",nullable=false, length=250)
	private String nombres;
	
	@Column(name="APELLIDO1",nullable=false, length=250)
	private String apellido1;
	
	@Column(name="APELLIDO2",nullable=false, length=250)
	private String apellido2;
	
	
	
	//@Column(name="DATE")
	//private Date fechaNacimiento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	/*public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	*/
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
