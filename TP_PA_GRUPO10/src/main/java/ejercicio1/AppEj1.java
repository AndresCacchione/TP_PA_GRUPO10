package ejercicio1;

import java.sql.Date;

import ejercicio1.dao.DaoUsuario;
import ejercicio1.entidad.DatosPersonales;
import ejercicio1.entidad.Pais;
import ejercicio1.entidad.Usuario;

public class AppEj1 {

	public static void main(String[] args) {
		
		/*Ejercicio1:
		Crear un paquete llamado ejercicio1, y en él crear clases que cumplan con una
		relación uno a uno. Además deberán mapear las clases para que se creen las mismas
		en la base de datos y debe haber un main en su interior que inserte un registro en la
		base de datos y luego lo lea.*/
		
		Pais pais = new Pais("Argentina");
		DatosPersonales datosPersonales = new DatosPersonales(123456789, "Cosme", "Fulanito", new Date(1980,10,20), 'M', 1111111111, "cosme.fulanito@gmail.com", "Av. Springfield 1234", "1313456" , pais);
		Usuario usuario = new Usuario(datosPersonales.getDni(), "cosmeFulanito", "cosme_el_mejor_2022", datosPersonales);
		
		DaoUsuario.Add(usuario);
		DaoUsuario.ReadUsuarioByID(usuario.getId());
		
	}

}
