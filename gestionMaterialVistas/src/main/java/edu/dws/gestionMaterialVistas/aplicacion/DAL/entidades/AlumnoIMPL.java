package edu.dws.gestionMaterialVistas.aplicacion.DAL.entidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class AlumnoIMPL implements InterfazAlumno {

	@PersistenceContext
	EntityManager entity;
	
	
	@Override
	public void InsertarAlumno(Alumno alumno) {
		
		try {
		entity.persist(alumno);
		entity.clear();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	

	
	@Override
	public List<Alumno> ListarAlumno() {
		// TODO Auto-generated method stub
		try {
		String jpql = "SELECT a FROM Alumno a WHERE a.portatil !=null";
		Query query = entity.createQuery(jpql);
		
		return query.getResultList();
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public void EliminarAlumno(int id) {
		
		try {
		
		String jpql = "DELETE FROM Alumno a WHERE a.id=:id_alumno";
		Query query = entity.createQuery(jpql);
		query.setParameter("id_alumno", id);
		int eliminados = query.executeUpdate();
		System.out.println("el numero de eliminados es: " +eliminados);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}




	@Override
	public List<Alumno> BuscarAlumnoPorPortatil(int id_portatil) {
		
		try {
		String jpql= "SELECT a.nombre FROM Alumno a WHERE a.id=:id_portatil";
		Query query = entity.createQuery(jpql);
		query.setParameter("id_portatil", id_portatil);
		
		return query.getResultList();
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
