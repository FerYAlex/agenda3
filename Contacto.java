package agenda;

import java.util.Date;
import java.util.Scanner;

public class Contacto {
	static Scanner sc=new Scanner(System.in);
	
	
	private String nombre;
	private double telefono;
	private String cumpleanos;
	
	
	
	
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}


// constructor

	public Contacto(String nombre, double telefono, String cumpleaños) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
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


// metodo toString

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
