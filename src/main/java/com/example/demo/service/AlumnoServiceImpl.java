package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AlumnoRepository;
import com.example.demo.repository.modelo.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public void buscar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepository.insertar(alumno);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		this.alumnoRepository.actualizar(alumno);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.alumnoRepository.eliminar(id);
	}

	@Override
	public Alumno buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.alumnoRepository.seleccionarPorId(id);
	}

}
