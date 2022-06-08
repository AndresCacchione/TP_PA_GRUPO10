package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import ejercicio4.dao.DaoClase;
import ejercicio4.dao.DaoIdioma;
import ejercicio4.entidad.Clase;
import ejercicio4.entidad.Idioma;

public class AppEj4 {

	public static void main(String[] args) {
		/*
		 Ejercicio4:
			Crear un paquete llamado ejercicio4, y en él crear clases que cumplan con una
			muchos a muchos. Además, deberán mapear las clases para que se creen las mismas
			en la base de datos y debe haber un main en su interior que inserte un registro en la
			base de datos y luego lo lea.
		*/
		Idioma i1 = new Idioma("español",false);
		Idioma i2 = new Idioma("español",true);
		Idioma i3 = new Idioma("ingles",false);
		Idioma i4 = new Idioma("ingles",true);
		Idioma i5 = new Idioma("japones",true);
		Idioma i6 = new Idioma("chino",true);
		Idioma i7 = new Idioma("italiano",true);
		Idioma i8 = new Idioma("italiano",false);
		/*
		DaoIdioma.Add(i1);
		DaoIdioma.Add(i2);
		DaoIdioma.Add(i3);
		DaoIdioma.Add(i4);
		DaoIdioma.Add(i5);
		DaoIdioma.Add(i6);
		DaoIdioma.Add(i7);
		DaoIdioma.Add(i8);
		*/
		List<Idioma> l1= new ArrayList<Idioma>();
		List<Idioma> l2= new ArrayList<Idioma>();
		List<Idioma> l3= new ArrayList<Idioma>();
		l1.add(i1);
		l1.add(i2);
		l1.add(i3);
		l2.add(i3);
		l2.add(i4);
		l2.add(i5);
		l3.add(i6);
		l3.add(i7);
		l3.add(i8);
		
		Clase c1= new Clase("programacion avanzada",90,l1);
		Clase c2= new Clase("laboratorio 5",120,l2);
		Clase c3= new Clase("matematicas",60,l3);
		
		DaoClase.Add(c1);
		System.out.println("cargado 1");
		DaoClase.Add(c2);
		System.out.println("cargado 2");
		DaoClase.Add(c3);
		System.out.println("cargado 3");
	
		
		List<Idioma> listaIdiomas= DaoIdioma.ReadAll();
		List<Clase> listaClases= DaoClase.ReadAll();
		
		System.out.println("LISTA DE IDIOMAS");
		for(Idioma i : listaIdiomas) {
			System.out.println(i.toString());
			System.out.println("-------------------------------");
		}
		
		System.out.println("LISTA DE CLASES");
		for(Clase c : listaClases) {
			System.out.println(c.toString());
			System.out.println("-------------------------------");
		}
		
	}

}
