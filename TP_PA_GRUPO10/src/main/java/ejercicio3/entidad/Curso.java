package ejercicio3.entidad;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity	
public class Curso implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_curso")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private float costo;
	
	@Column(nullable=false)
	private Date estreno;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="id_nivel")
	private Nivel nivel;

	public Curso() {
		super();

	}

	public Curso(int id, String nombre, float costo, Date estreno, Nivel nivel) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.costo = costo;
		this.estreno = estreno;
		this.nivel=nivel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public Date getEstreno() {
		return estreno;
	}

	public void setEstreno(Date estreno) {
		this.estreno = estreno;
	}


	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Curso [  id_Curso  : " + id + ", nombre  : " + nombre + ", costo : " + costo + ", Fecha estreno  : " + estreno +", Nivel :  "+this.nivel.toString() +"]";
	}

}

