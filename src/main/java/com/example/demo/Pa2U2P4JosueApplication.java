package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CtaBancaria;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.service.CtaBancariaService;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.HabitacionService;
import com.example.demo.service.HotelService;

@SpringBootApplication
public class Pa2U2P4JosueApplication implements CommandLineRunner {

	/*@Autowired
	private EstudianteService estudianteService ;
	@Autowired*/
	//private CtaBancariaService bancariaService;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private HabitacionService habitacionService;
	
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
		
		/*Taller15************************/
		/*CtaBancaria bancaria = new CtaBancaria();
		bancaria.setCedulaPropietario("1720525516");
		bancaria.setFechaApertura(LocalDate.now());
		bancaria.setNumero("123456");
		bancaria.setSaldo(new BigDecimal(1000));
		bancaria.setTipo("A");
		//taller 16 creacion one to one ciudadano empleado
		 
		this.bancariaService.apertura(bancaria);*/
		
		//*********************************************************************************
		//******************************************************************************************
				
		System.out.println("taller 17 one to many");
		
		Hotel hotel = new Hotel();
		
		hotel.setNombre("Hotel 3");
		hotel.setDireccion("America");
		
		Hotel hotelB = new Hotel();
		
		hotelB.setNombre("Hotel 4");
		hotelB.setDireccion("Borrar");
		
		System.out.println("\nAgregar Hotel a la DB");
		this.hotelService.agregar(hotel);
		this.hotelService.agregar(hotelB);
		
		
		System.out.println("\nBuscar el hotel ANTES DE LA ACTUALIZACION");
		System.out.println(this.hotelService.buscarPorID(1));
		System.out.println(this.hotelService.buscarPorID(2));
		
		System.out.println("\nActualizar el hotel");
		hotel.setDireccion("Nueva direccion hotel 3.");
		this.hotelService.actualizar(hotel);
		
		System.out.println("\nBuscar el hotel DESPUES DE LA ACTUALIZACION");
		System.out.println(this.hotelService.buscarPorID(1));
		
		System.out.println("\nEliminar hotel");
		this.hotelService.borrarHotel(2);
		
		//**************************************************************
		
		System.out.println("HABITACIONES A HOTEL ");
		
		Habitacion habitacion = new Habitacion();
		
		habitacion.setNumero("1A");
		habitacion.setValor(new BigDecimal(100));
		habitacion.setHotel(hotel);
		
		Habitacion habitacion2 = new Habitacion();
		
		habitacion2.setNumero("1B");
		habitacion2.setValor(new BigDecimal(100));
		habitacion2.setHotel(hotel);
		
		System.out.println("\nAgregar habitaciones");
		this.habitacionService.agregar(habitacion);
		this.habitacionService.agregar(habitacion2);
		
		System.out.println("\nBuscar la habitacion ANTES DE LA ACTUALIZACION");
		System.out.println(this.habitacionService.buscarPorNumero(1));
		System.out.println(this.habitacionService.buscarPorNumero(2));
		
		System.out.println("\nActualizar la habitacion");
		habitacion2.setNumero("1C actualizacion");
		this.habitacionService.actualizar(habitacion2);
		
		System.out.println("\nBuscar el hotel DESPUES DE LA ACTUALIZACION");
		System.out.println(this.habitacionService.buscarPorNumero(2));
		
		System.out.println("\nEliminar hotel");
		this.habitacionService.borrarPorNumero(2);
		
		
	}

}
