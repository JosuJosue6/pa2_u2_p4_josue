package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MateriaRepository;
import com.example.demo.repository.modelo.Materia;

@Service
public class MateriaServiceImpl implements MateriaService{

	@Autowired
	private MateriaRepository materiaRepository;
	
	@Override
	public void buscarar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(materia);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(materia);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.materiaRepository.eliminar(id);
	}

	@Override
	public Materia buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.materiaRepository.seleccionarPorId(id);
	}

}
