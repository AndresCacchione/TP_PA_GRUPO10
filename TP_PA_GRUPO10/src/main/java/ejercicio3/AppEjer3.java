package ejercicio3;

import java.sql.Date;

import ejercicio1.dao.DaoUsuario;


import ejercicio3.dao.DaoCurso;
import ejercicio3.dao.DaoNivel;
import ejercicio3.entidad.Curso;
import ejercicio3.entidad.Nivel;


public class AppEjer3 {
	
	public static void main(String[] args) {

		/*Ejercicio3:
		Crear un paquete llamado ejercicio3, y en él crear clases que cumplan con una
		relación muchos a uno. Además, deberán mapear las clases para que se creen las
		mismas en la base de datos y debe haber un main en su interior que inserte un
		registro en la base de datos y luego lo lea.*/

		Nivel nivel=new Nivel(1,"basico");
		DaoNivel.Add(nivel);
		Curso curso =new Curso(1,"lab5",5000,new Date(2022,10,10),nivel);
		
		DaoCurso.Add(curso);
		
		DaoCurso.ReadCursoById(1);
		
	}

}
