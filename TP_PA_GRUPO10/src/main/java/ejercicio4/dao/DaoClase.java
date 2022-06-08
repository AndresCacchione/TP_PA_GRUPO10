package ejercicio4.dao;

import java.util.List;

import org.hibernate.Session;

import dao.ConfigHibernate;
import ejercicio4.entidad.Clase;
import ejercicio4.entidad.Idioma;

public class DaoClase {
	private static ConfigHibernate config;
	private static Session session;
	
	public static void Add(Clase c) {
		config= new ConfigHibernate();
		session=config.abrirConexion();
		session.beginTransaction();
		session.save(c);	
		session.getTransaction().commit();
		config.cerrarSession();
	}
	public static Clase ReadOne(int id) {
		config= new ConfigHibernate();
		session = config.abrirConexion();
		Clase c =(Clase) session.createQuery("FROM ejercicio4.entidad.Clase c WHERE c.id ="+ id).uniqueResult();
		config.cerrarSession();
		return c;
	}
	public static List <Clase> ReadAll() {
		config= new ConfigHibernate();
		session = config.abrirConexion();
		List<Clase> lista = (List<Clase>)session.createQuery("FROM ejercicio4.entidad.Clase c").list();
		config.cerrarSession();
		return lista;
	}
}
