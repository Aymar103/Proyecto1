package copy._2;
import java.util.Scanner;
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
		System.out.println("Introduce la edad de la primera persona: ");
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
		
		
	
		leer.close();
		persona1.imprimeDatos();
		persona2.imprimeDatos();
		
	}
	// Imprimo los datos de las dos personas

	
}

