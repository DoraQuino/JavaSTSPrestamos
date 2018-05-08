package bo.gob.egpp.prestamos.model;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="PAGOS")

public class Pagos {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID_PAGOS")
	private Integer idPagos;
	
	@Column(name="ID_PRESTAMO")
	private Integer idPrestamo;
	
	@Column(name="FECHA_PAGO", nullable=false)
	private Date fechaPago;
	
	@Column(name="MONTO",nullable=false, scale=2)
	private double montoPagado;
	
	
	
	public Integer getIdPagos() {
		return idPagos;
	}
	public void setIdPagos(Integer idPagos) {
		this.idPagos = idPagos;
	}
	public Integer getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public double getMontoPagado() {
		return montoPagado;
	}
	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}
	
	

}
