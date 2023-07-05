package com.example.demo.service;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaService {
	
	public void agregar(Matricula matricula);
	
	public void actualizar(Matricula matricula);
	
	public void borrar(Integer id);
	
	public Matricula buscarPorId(Integer id);
}
