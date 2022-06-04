package ejercicio2.entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="pagos")
public class Pago implements Serializable{
	@Id
	@Column(name="id_pago")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="fecha_pago", nullable=false)
	private Date fecha;
	
	@Column(nullable=false)
	private double importe;
	
	//Constructores
	Pago (){	
	}

	public Pago(Date fecha, double importe) {
		super();
		this.fecha = fecha;
		this.importe = importe;
	}

	
	//Getters & setters
	public int getId() {
		return id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	//toString
	@Override
	public String toString() {
		return "Pago: id: " + id + ", fecha: " + fecha + ", importe: $" + importe + " .-";
	}
}
