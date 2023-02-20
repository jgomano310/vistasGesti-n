package edu.dws.gestionMaterialVistas.aplicacion.DAL.entidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


@Repository
public class PortatilIMPL implements InterfazPortatil {
	
	@PersistenceContext
	EntityManager entity;
	public void Insertar(Portatil portatil) {
		// TODO Auto-generated method stub
		try {
		entity.persist(portatil);
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}

	@Override
	
	public List<Portatil> listarPortatil() {
		// TODO Auto-generated method stub
		try {
		String jpql = "SELECT p FROM Portatil p";
		Query query = entity.createQuery(jpql);
		
		return query.getResultList();
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	
	
}
