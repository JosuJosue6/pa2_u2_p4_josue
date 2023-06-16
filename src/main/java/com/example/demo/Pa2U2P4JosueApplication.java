package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CtaBancaria;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.CtaBancariaService;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4JosueApplication implements CommandLineRunner {

	/*@Autowired
	private EstudianteService estudianteService ;*/
	@Autowired
	private CtaBancariaService bancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JosueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Ocapana");
		estudiante.setNombre("Josue");
		estudiante.setCedula("1720525516");
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Ocapana");
		estudiante2.setNombre("Josue");
		estudiante2.setCedula("111");
		this.estudianteService.agregar(estudiante2);
		
		this.estudianteService.agregar(estudiante);
		this.estudianteService.buscarPorCedula(estudiante.getCedula());
		estudiante.setNombre("Anderson");
		this.estudianteService.actualizar(estudiante);
		this.estudianteService.borrar("1720525516");*/
		
		CtaBancaria bancaria = new CtaBancaria();
		bancaria.setCedulaPropietario("1720525516");
		bancaria.setFechaApertura(LocalDate.now());
		bancaria.setNumero("123456");
		bancaria.setSaldo(new BigDecimal(1000));
		bancaria.setTipo("A");
		
		this.bancariaService.apertura(bancaria);
	}

}
