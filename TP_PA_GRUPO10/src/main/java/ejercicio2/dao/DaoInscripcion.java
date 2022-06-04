package ejercicio2.dao;

import java.sql.Date;

import org.hibernate.Query;
import org.hibernate.Session;

import dao.ConfigHibernate;
import ejercicio2.entidad.Inscripcion;

public class DaoInscripcion {
	private static ConfigHibernate cHibernate;
	private static Session session;
	
	public static void ReadInscripcionPorID(int id) {
		cHibernate = new ConfigHibernate();
		session = cHibernate.abrirConexion();
		Query query = session.createQuery("FROM ejercicio2.entidad.Inscripcion i WHERE i.id = :id");
		query.setParameter("id", id);
		
		Inscripcion inscripcion = (Inscripcion)query.uniqueResult();
		
		System.err.println("Incripción correspondiente al id " + id +  ": ");
		System.out.print(inscripcion.toString());
		
		cHibernate.cerrarSession();
	}
	
	public static void Add(Inscripcion inscripcion) {
		cHibernate = new ConfigHibernate();
		session = cHibernate.abrirConexion();
		session.beginTransaction();
		session.save(inscripcion);
		session.getTransaction().commit();
		cHibernate.cerrarSession();
	}
	
	protected static Date formatDate(Date date) {
		date.setMonth(date.getMonth()-1);
		date.setYear(date.getYear()-1900);
		return date;
	}
	
}
