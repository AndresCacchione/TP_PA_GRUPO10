package ejercicio3.dao;


import org.hibernate.Session;

import dao.ConfigHibernate;
import ejercicio3.entidad.Nivel;

public class DaoNivel {
	
	private static ConfigHibernate cHibernate;
	private static Session session;
	
	
	public static void Add(Nivel nivel) {
		cHibernate = new ConfigHibernate();
		session = cHibernate.abrirConexion();
		session.beginTransaction();
		session.save(nivel);		
		session.getTransaction().commit();
		cHibernate.cerrarSession();
	}
	

}