package ar.edu.unju.fi.main;

import java.util.Scanner;
import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// while ejemeplo
		/*
		System.out.println("Inicio del programa");
		int numero = 11;
		while(numero <= 10) {
			System.out.println(numero);
			numero++;
		}
		
		System.out.println("Fin del programa");
		
		// do while ejemplo
		System.out.println("Inicio del Programa");
		numero = 11;
		do {
			System.out.println(numero);
			numero++;
		} while(numero <= 10);
		System.out.println("Fin del programa");
		*/
		// nos pide que para el alumno Ariel Vega se registre las notas finales de 4 materias
		
	
		
		Alumno alumno = generarAlumno();		
		registrarNotas(alumno, 2);
		
	}
	
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		//scanner.close();
		return alumno;
		
	}
	
	public static void registrarNotas (Alumno alumno, int numMaterias) {
		Scanner scanner = new Scanner(System.in);
		while(numMaterias <= 2){
			//cargar materia
			System.out.println("Ingrese el código de la materia:  ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el código del registro de nota:  ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la Nota Final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			numMaterias++;
			
		}
		//scanner.close();
	}
	

}
