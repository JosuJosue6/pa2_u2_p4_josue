package com.example.demo.service;

import com.example.demo.repository.modelo.Materia;

public interface MateriaService {

	public void buscarar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public void borrar(Integer id);
	
	public Materia buscarPorId(Integer id);
}
