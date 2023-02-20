package edu.dws.gestionMaterialVistas.aplicacion.DAL.entidades;

import java.util.List;


public interface InterfazAlumno {

public void InsertarAlumno(Alumno alumno);
	
	//método que muestra los alumnos
	public List<Alumno> ListarAlumno();
	
	//método que elimina un alumno por su nombre
	public void EliminarAlumno(int id);
	
	
	public List<Alumno> BuscarAlumnoPorPortatil(int id);
}
