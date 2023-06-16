package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Estudiante estudiante = this.seleccionarPorCedula(cedula);
		this.entityManager.remove(estudiante);
	}

	@Override
	public Estudiante seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, cedula);
	}

}
