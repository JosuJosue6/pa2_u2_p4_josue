package com.example.demo.repository;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaRepository {

	public void insertar(Matricula matricula);
	
	public void actualizar(Matricula matricula);
	
	public void eliminar(Integer id);
	
	public Matricula seleccionarPorId(Integer id);
}
