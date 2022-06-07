package ejercicio3.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import dao.ConfigHibernate;

import ejercicio3.entidad.Curso;

public class DaoCurso {
	private static ConfigHibernate cHibernate;
	private static Session session;
	
	
	public static void Add(Curso curso) {
		cHibernate = new ConfigHibernate();
		session = cHibernate.abrirConexion();
		session.beginTransaction();
		session.save(curso);		
		session.getTransaction().commit();
		cHibernate.cerrarSession();
	}
	
	public static void ReadCursoById(int id) {
		cHibernate = new ConfigHibernate();
		session = cHibernate.abrirConexion();
		Query query = session.createQuery("FROM ejercicio3.entidad.Curso c WHERE c.id = :id");
		query.setParameter("id", id);
		
		Curso curso = (Curso)query.uniqueResult();
		
		System.out.print(curso.toString());
		
		cHibernate.cerrarSession();
	}
	

}

