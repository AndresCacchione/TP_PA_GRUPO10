package ejercicio1.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DatosPersonales implements Serializable {
	@Id
	@Column
	private int dni;
	
	@Column(nullable=false)
	private String apellido;
	
	@Column(nullable=true)
	private String nombre;
	
	@Column(nullable=false)
	private Date fechaNacimiento;
	
	@Column(nullable=true)
	private char genero;
	
	@Column(nullable=false)
	private int celular;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=true)
	private String domicilio;
	
	@Column(nullable=true)
	private String codigoPostal;
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="IdPais")
	private Pais pais;
	
	@OneToOne(mappedBy="datosPersonales", fetch=FetchType.EAGER)
	private Usuario usuario;
	
	
	//Ctor sin parámetros
	public DatosPersonales() {
		super();
	}

	
	//Ctor con parámetros
	public DatosPersonales(int dni, String apellido, String nombre, Date fechaNacimiento, char genero, int celular, String email,
			String domicilio, String codigoPostal, Pais pais) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.celular = celular;
		this.email = email;
		this.domicilio = domicilio;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}


	
	//Getters y Setters
	
	public int getDni() {
		return dni;
	}
	
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	
	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public String getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	//toString
	@Override
	public String toString() {
		String auxiliar;
		if (usuario != null) {
			auxiliar = "Usuario: Dni: " + usuario.getId() + ", nombre de usuario: " + usuario.getNombreUsuario() + ", " + ", pass: " + usuario.getPass()
					+ ", Datos personales: dni: " + dni + ", apellido: " + apellido + ", nombre: " + nombre + ", fecha de nacimiento: " + fechaNacimiento
					+ ", genero: " + genero + ", celular: " + celular + ", email: " + email + ", domicilio: " + domicilio
					+ ", código postal: " + codigoPostal + ", ID de país: " + pais.getId() + ", nombre de país: " + pais.getNombre() + ".";
		} else {
			auxiliar = "Usuario: Dni: " + dni + ", apellido: " + apellido + ", nombre: " + nombre + ", fecha de nacimiento: " + fechaNacimiento
					+ ", genero: " + genero + ", celular: " + celular + ", email: " + email + ", domicilio: " + domicilio
					+ ", código postal: " + codigoPostal + ", ID de país: " + pais.getId() + ", nombre de país: " + pais.getNombre() + ".";
		}
		
		return auxiliar;
	}
}
