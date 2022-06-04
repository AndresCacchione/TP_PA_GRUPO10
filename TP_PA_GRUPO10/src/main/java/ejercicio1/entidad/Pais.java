package ejercicio1.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="paises")
public class Pais implements Serializable {
	@Id
	@Column(name="IdPais")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String nombre;
	
	@OneToOne(mappedBy="pais", fetch=FetchType.EAGER)
	private DatosPersonales datosPersonales;
	
	//Ctor sin parámetros
	public Pais() {
		super();
	}
	
	//Ctor con parámetros
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public DatosPersonales getDatosPersonales() {
		return datosPersonales;
	}

	public void setDatosPersonales(DatosPersonales datosPersonales) {
		this.datosPersonales = datosPersonales;
	}

	//toString
	@Override
	public String toString() {
		String auxiliar;
		if (datosPersonales != null) {
			auxiliar = datosPersonales.toString() + ", Id de país: " + id + ", nombre de país: " + nombre + ".";
		} else {
			auxiliar = " Id de país: " + id + ", nombre de país: " + nombre;
		}
		
		return auxiliar;
	}
}
