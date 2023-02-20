package edu.dws.gestionMaterialVistas.aplicacion.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.dws.gestionMaterialVistas.aplicacion.DAL.entidades.Portatil;
import edu.dws.gestionMaterialVistas.aplicacion.DAL.entidades.PortatilIMPL;

@Service

public class PortatilConsultas {
	@Autowired
	private PortatilIMPL p;

	
	@Transactional
	public void Insertar(Portatil portatil) {
		// TODO Auto-generated method stub
		p.Insertar(portatil);
		
		
	}

	
	@Transactional
	public List<Portatil> listarPortatil() {
		// TODO Auto-generated method stub
		return p.listarPortatil();
	}
	
}
