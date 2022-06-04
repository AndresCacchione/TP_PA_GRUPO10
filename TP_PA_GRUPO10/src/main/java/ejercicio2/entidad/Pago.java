package ejercicio2.entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pago implements Serializable{
	@Id
	@Column(name="id_pago")
	private int id;
	
	@Column(name="fecha_pago", nullable=false)
	private Date fecha;
	
	@Column(nullable=false)
	private float importe;
	
	//Constructores
	Pago (){	
	}

	public Pago(int id, Date fecha, float importe) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.importe = importe;
	}

	
	//Getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public float getImporte() {
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
