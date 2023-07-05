package com.example.demo.service;

import com.example.demo.repository.modelo.Alumno;

public interface AlumnoService {

	public void buscar(Alumno alumno);
	
	public void actualizar(Alumno alumno);
	
	public void borrar(Integer id);
	
	public Alumno buscarPorId(Integer id);
}
