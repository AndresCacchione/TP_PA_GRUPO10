package ejercicio1.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import ejercicio1.entidad.Usuario;

public class DaoUsuario {
	private static ConfigHibernate cHibernate;
	private static Session session;
	
	
	public static void ReadUsuarioByID(int id) {
		cHibernate = new ConfigHibernate();
		session = cHibernate.abrirConexion();
		Query query = session.createQuery("FROM Usuario u WHERE u.id = :id");
		query.setParameter("id", id);
		
		Usuario usuario = (Usuario)query.uniqueResult();
		
		System.err.println("Usuario con id " + id +  ": ");
		System.out.print(usuario.getDatosPersonales().getPais().toString());
		
		cHibernate.cerrarSession();
	}

	public static void Add(Usuario usuario) {
		cHibernate = new ConfigHibernate();
		session = cHibernate.abrirConexion();
		session.beginTransaction();
		session.save(usuario);		
		session.getTransaction().commit();
		cHibernate.cerrarSession();
	}
}
