package ejercicio4.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Idioma implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="idioma")
	private String nombre;
	@Column(name="tiene_subtitulo")
	private boolean isSubtitulo;
	
	public Idioma() {}
	
	public Idioma(int id, String nombre, boolean isSubtitulo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.isSubtitulo = isSubtitulo;
	}
	
	public Idioma(String nombre, boolean isSubtitulo) {
		super();
		this.nombre = nombre;
		this.isSubtitulo = isSubtitulo;
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

	public boolean isSubtitulo() {
		return isSubtitulo;
	}

	public void setSubtitulo(boolean isSubtitulo) {
		this.isSubtitulo = isSubtitulo;
	}

	@Override
	public String toString() {
		return "Idioma id=" + id + ", nombre=" + nombre + ", isSubtitulo=" + isSubtitulo + ".";
	}
	
	
	
}
