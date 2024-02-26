package agenda;

import java.util.Date;
import java.util.Scanner;

public class Contacto {
	static Scanner sc=new Scanner(System.in);
	
	
	private String nombre;
	private double telefono;
	private String cumpleanos;
	private String apellido;
	private String apellido2;
	private String direccion;
	private int edad;
	

	
	
	
	
	

	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}
	


public Contacto(String nombre, double telefono, String cumpleanos, String apellido, String apellido2,
			String direccion, int edad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.cumpleanos = cumpleanos;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.edad = edad;
	}



// constructor

	public Contacto(String nombre, double telefono, String cumpleanos, String apellido, String apellido2,
			String direccion) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.cumpleanos = cumpleanos;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.direccion = direccion;
	}


	public Contacto(String nombre, double telefono, String cumpleaños) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.cumpleanos = cumpleanos;
	}
	public Contacto(String nombre,String apellido, double telefono, String cumpleaños) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.apellido= apellido;
		this.cumpleanos = cumpleanos;
	}
	


//getters y setters

	public String getNombre() {
		return nombre;
	}

	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public double getTelefono() {
		return telefono;
	}




	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}




	public String getCumpleanos() {
		return cumpleanos;
	}




	public void setCumpleaños(String cumpleanos) {
		this.cumpleanos = cumpleanos;
	}
	
	
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


// metodo toString

	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", cumpleaños=" + cumpleanos + "]";
	}
	
	
	public void annadirDatosContacto() {
		
		System.out.print("Nombre: ");
		nombre=sc.next();
		System.out.print("telefono: ");
		telefono=sc.nextInt();
		System.out.print("Cumpleaños (formato dd/mm/aa:) ");
		cumpleanos=sc.next();
	}
	
	
	
	
	
	
	
}
