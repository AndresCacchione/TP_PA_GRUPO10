package ejercicio4.dao;

import java.util.List;
import org.hibernate.Session;
import dao.ConfigHibernate;
import ejercicio4.entidad.Idioma;

public class DaoIdioma {
	private static ConfigHibernate config;
	private static Session session;
	
	public static void Add(Idioma i) {
		config= new ConfigHibernate();
		session=config.abrirConexion();
		session.beginTransaction();
		session.save(i);	
		session.getTransaction().commit();
		config.cerrarSession();
	}
	public static Idioma ReadOne(int id) {
		config= new ConfigHibernate();
		session = config.abrirConexion();
		Idioma i =(Idioma) session.createQuery("FROM ejercicio4.entidad.Idioma i WHERE i.id ="+ id).uniqueResult();
		config.cerrarSession();
		return i;
	}
	public static List <Idioma> ReadAll() {
		config= new ConfigHibernate();
		session = config.abrirConexion();
		List<Idioma> lista = (List<Idioma>)session.createQuery("FROM ejercicio4.entidad.Idioma i").list();
		config.cerrarSession();
		return lista;
	}
}
