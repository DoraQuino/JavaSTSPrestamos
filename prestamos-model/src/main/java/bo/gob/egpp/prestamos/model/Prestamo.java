package bo.gob.egpp.prestamos.model;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="PRESTAMO")


public class Prestamo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID_PRESTAMO")
	private Integer idPrestamo;
	
//	@Column(name="ID")
//	private Integer id;//ID de la tabla persona
	
	@ManyToOne
	@JoinColumn(name="ID_PERSONA")
	private Persona persona;//ID de la tabla persona
	
	@Column(name="FECHA_PRESTAMO", nullable=false)
	private Date fechaPrestamo;
	
	@Column(name="MONTO",nullable=false, scale=2)
	private double monto;
	
	@Column(name="NUMERO_PAGOS")
	private Integer NumeroPagos;
	
	@Column(name="ESTADO_PRESTAMO")
	private Integer EstadoPrestamo;

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Integer getNumeroPagos() {
		return NumeroPagos;
	}

	public void setNumeroPagos(Integer numeroPagos) {
		NumeroPagos = numeroPagos;
	}

	public Integer getEstadoPrestamo() {
		return EstadoPrestamo;
	}

	public void setEstadoPrestamo(Integer estadoPrestamo) {
		EstadoPrestamo = estadoPrestamo;
	}
	

}
