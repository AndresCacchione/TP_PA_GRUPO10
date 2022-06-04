package ejercicio2;

import java.sql.Date;
import java.util.ArrayList;

import ejercicio1.dao.DaoUsuario;
import ejercicio1.entidad.Usuario;
import ejercicio2.dao.DaoInscripcion;
import ejercicio2.entidad.Inscripcion;
import ejercicio2.entidad.Pago;

public class AppEj2 {

	public static void main(String[] args) {
		/*Ejercicio2:
		Crear un paquete llamado ejercicio2, y en él crear clases que cumplan con una
		relación uno a muchos. Además, deberán mapear las clases para que se creen las
		mismas en la base de datos y debe haber un main en su interior que inserte un
		registro en la base de datos y luego lo lea.*/
		
		Usuario usuario = DaoUsuario.GetUsuarioByID(123456789);
		
		ArrayList<Pago> pagos = new ArrayList<Pago>();
		
		pagos.add(new Pago(new Date(2020, 12, 7), 7500.50));
		pagos.add(new Pago(new Date(2021, 11, 12), 12300.25));
		pagos.add(new Pago(new Date(2022, 8, 4), 4700.75));
		
		Inscripcion inscripcion = new Inscripcion(usuario, new Date(2019, 10, 10), 20000, pagos);
		DaoInscripcion.Add(inscripcion);
		
		
		

	}

}
