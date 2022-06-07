package ejercicio4.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Clase implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int minutosDuracion;
	
	@ManyToMany(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinTable(
			name="clases_x_Idiomas",
			joinColumns= { @JoinColumn(name="id_clase") },
			inverseJoinColumns= { @JoinColumn(name="id_Idioma") }
			)
	private List <Idioma> listaIdiomas = new ArrayList<Idioma>();

	public Clase() {}
	
	public Clase(int id, String nombre, int minutosDuracion, List<Idioma> listaIdiomas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.minutosDuracion = minutosDuracion;
		this.listaIdiomas = listaIdiomas;
	}
	
	public Clase(String nombre, int minutosDuracion, List<Idioma> listaIdiomas) {
		super();
		this.nombre = nombre;
		this.minutosDuracion = minutosDuracion;
		this.listaIdiomas = listaIdiomas;
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

	public int getMinutosDuracion() {
		return minutosDuracion;
	}

	public void setMinutosDuracion(int minutosDuracion) {
		this.minutosDuracion = minutosDuracion;
	}

	public List<Idioma> getListaIdiomas() {
		return listaIdiomas;
	}

	public void setListaIdiomas(List<Idioma> listaIdiomas) {
		this.listaIdiomas = listaIdiomas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Clase id=" + id + "\n" +"nombre=" + nombre + "\n" +"minutosDuracion=" + minutosDuracion + "\n" +"listaIdiomas="
				+ listaIdiomas + ".";
	}
}
