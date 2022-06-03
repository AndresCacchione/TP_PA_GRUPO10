package ejercicio1;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Usuario implements Serializable{
	@Id
	@Column(name="dni", nullable=false)
	private int dni;
	
	@Column(nullable=false)
	private String nombreUsuario;
	
	@Column(nullable=false)
	private String pass;
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="dni")
	private DatosPersonales datosPersonales;
	
	//Ctor sin parámetros
	public Usuario() {
		super();
	}
	
	//Ctor con parámetros
	public Usuario(int id, String nombreUsuario, String pass, DatosPersonales datosPersonales) {
		super();
		this.dni = id;
		this.nombreUsuario = nombreUsuario;
		this.pass = pass;
		this.datosPersonales = datosPersonales;
	}

	//Getters y Setters
	public int getId() {
		return dni;
	}

	public void setId(int id) {
		this.dni = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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
		return "Usuario: Nombre de Usuario: " + nombreUsuario + ", Contraseña: " + pass + ", datosPersonales="
				+ datosPersonales.toString() + ".";
	}
	
	
}

