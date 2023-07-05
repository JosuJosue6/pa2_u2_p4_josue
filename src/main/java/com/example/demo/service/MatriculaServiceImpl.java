package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.modelo.Matricula;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Override
	public void agregar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(matricula);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(id);
	}

	@Override
	public Matricula buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.seleccionarPorId(id);
	}

}
