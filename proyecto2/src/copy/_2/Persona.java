package copy._2;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;

	public Persona( String nombre, String apellidos, String dni, int edad) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDNI(dni);
		this.setEdad(edad);
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String  getNombre() {
		return nombre;
	}
	public void setDNI(String dni) {
		this.dni=dni;
	}
	public String  getDNI() {
		return dni;
	}
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public String  getApellidos() {
		return apellidos;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad() {
		return edad;
	}
	public void imprimeDatos() {
		System.out.println("DNI: " + this.getEdad()+", Nombre: " +this.getNombre()+", Apellidos: " + this.getApellidos()+", Edad: " + this.getEdad());
		System.out.println("Es mayor de edad: "+mayorEdad(edad));
		System.out.println("Es jubilado: " + esJubilado(edad));
		
	}
	public boolean mayorEdad(int edad) {
		return (edad>=18);
	}
	public boolean esJubilado (int edad) {
		return (edad>=65);
	}
	public int difrenciaEdad (Persona p) {
		return (int) (this.getEdad()-p.edad);
	}
}

