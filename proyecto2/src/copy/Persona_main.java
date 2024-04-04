package copy;
import java.util.Scanner;

import copy._2.Persona;
public class Persona_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaro dos personas
		String nombre, apellidos, dni;
		int edad;
		Persona persona1;
		Persona persona2;
		Scanner leer = new Scanner(System.in);
		//Pido los datos de las dos personas
		System.out.println("Introduce el nombre de la primera persona:");
		nombre= leer.nextLine();
		System.out.println("Introduce el apellido de la primera persona: ");
		apellidos= leer.nextLine();
		System.out.println("Introduce el DNI de la primera persona: ");
		dni= leer.nextLine();
		System.out.println("Introduce la edad de la primera personas: ");
		edad =leer.nextInt();
		
		persona1=new Persona(nombre, apellidos, dni, edad);
				
		leer.nextLine();
		System.out.println("Introduce el nombre de la segunda persona:");
		nombre= leer.nextLine();
		System.out.println("Introduce el apellido de la segunda persona: ");
		apellidos= leer.nextLine();
		System.out.println("Introduce el DNI de la segunda persona: ");
		dni= leer.nextLine();
		System.out.println("Introduce la edad de la segunda persona: ");
		edad =leer.nextInt();
		
		persona2=new Persona(nombre, apellidos, dni, edad);
		
		mostrarNombrePersona(persona1);
		
		mostrarNombrePersona(persona2);
		
		leer.close();
		
	}
	// Imprimo los datos de las dos personas
	public static void mostrarNombrePersona(Persona p) {
		System.out.println("Nombre: " +p.getNombre() + " con Apellidos: " + p.getApellidos() );
		System.out.println("Con DNI: " + p.getDNI());
		System.out.println("Es mayor de edad: " + mayorEdad(p.getEdad()));
	}
	public static boolean mayorEdad(int edad) {
			
		return (edad >=18);
	}
}

