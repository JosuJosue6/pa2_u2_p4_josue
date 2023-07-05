package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;
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
	
	@Autowired
	private AutorService autorService;
	
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
				
		/*System.out.println("taller 17 one to many");
		
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
		this.habitacionService.borrarPorNumero(2);*/
		
		System.out.println("Taller 18 Many to Many");
		Autor autor1 = new Autor();
		autor1.setApellido("Ocapana");
		autor1.setNombre("Josue");
		
		Autor autor2 = new Autor();
		autor2.setApellido("Ocapana - 2");
		autor2.setNombre("Josue - 2");
		
		Autor autor3 = new Autor();
		autor3.setApellido("Ocapana-3");
		autor3.setNombre("Josue-3");
		
		Libro libro1 = new Libro();
		libro1.setEditorial("Editorial 1");
		libro1.setTitulo("Libro 1");
		
		Libro libro2 = new Libro();
		libro2.setEditorial("Editorial 1");
		libro2.setTitulo("Libro 1");
		
		Libro libro3 = new Libro();
		libro3.setEditorial("Editorial 1");
		libro3.setTitulo("Libro 3");
		
		//Autor1 escribe 2 libros(1 y 3)
		Set<Libro> librosAutor1 = new HashSet<>();
		librosAutor1.add(libro1);
		librosAutor1.add(libro3);
		
		autor1.setLibros(librosAutor1);
		
		//autor 2 escribe 1 libro(2)
		Set<Libro> librosAutor2 = new HashSet<>();
		librosAutor2.add(libro2);
		
		autor2.setLibros(librosAutor2);
		
		//autores del libro 1 y 3
		Set<Autor>autores = new HashSet<>();
		autores.add(autor1);
		
		libro1.setAutores(autores);//autor1
		libro3.setAutores(autores);//autor1
		
		//Autores del libro 2
		Set<Autor>autores2 = new HashSet<>();
		autores2.add(autor2);

		libro2.setAutores(autores2);//autor2
		
		this.autorService.agregar(autor1);
		this.autorService.agregar(autor2);
		this.autorService.agregar(autor3);
		
		
	}

}
