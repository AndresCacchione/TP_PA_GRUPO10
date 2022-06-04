package ejercicio2.entidad;

import ejercicio1.entidad.Usuario;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Inscripcion implements Serializable{
	
	@Id
	@Column(name="id_inscripcion")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="idUsuario")
	private Usuario usuarioInscripto;
	
	@Column(nullable=false)
	private Date fechaInscripcion;
	
	@Column(nullable=false)
	private float costo;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id_inscripcion")
	private List<Pago> listaPagos;
	
	//Constructores
	public Inscripcion() {
	}
	
	public Inscripcion(int id, Usuario usuario, Date fechaInscripcion, float costo, ArrayList<Pago> listaPagos) {
		super();
		this.id = id;
		this.usuarioInscripto = usuario;
		this.fechaInscripcion = fechaInscripcion;
		this.costo = costo;
		this.listaPagos = listaPagos;
	}


	//Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuarioInscripto;
	}
	public void setUsuario(Usuario usuario) {
		this.usuarioInscripto = usuario;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public List<Pago> getListaPagos() {
		return listaPagos;
	}
	public void setListaPagos(List<Pago> listaPagos) {
		this.listaPagos = listaPagos;
	}

	//toString
	@Override
	public String toString() {
		String datosInscripcion =  "Inscripciones: id= " + id + ", Usuario inscripto: " + usuarioInscripto + ", fechaInscripcion: " + 
									fechaInscripcion + ", costo: " + costo + " .";
		for (Pago pago : listaPagos) {
			datosInscripcion.concat(pago.toString() + " - ");
		}
		return datosInscripcion;
	}
}
