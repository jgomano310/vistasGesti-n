package edu.dws.gestionMaterialVistas.aplicacion.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.dws.gestionMaterialVistas.aplicacion.DAL.entidades.Alumno;
import edu.dws.gestionMaterialVistas.aplicacion.DAL.entidades.AlumnoIMPL;


@Service
public class AlumnoConsultas {
	
		
		@Autowired
		private AlumnoIMPL a;
		
		@Transactional
		public void InsertarAlumno(Alumno alumno) {
			a.InsertarAlumno(alumno);
		}

		
		@Transactional
		public List<Alumno> ListarAlumno() {
			// TODO Auto-generated method stub
			
			return a.ListarAlumno();
		}
		
		@Transactional
		public void EliminarAlumno(int id) {
			a.EliminarAlumno(id);
		}
			
		@Transactional
		public List<Alumno> BuscarAlumnoPorPortatil(int id_portatil) {
				
				return a.BuscarAlumnoPorPortatil(id_portatil);
			}
			
			
			
		}

