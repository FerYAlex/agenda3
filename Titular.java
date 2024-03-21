package CuentaBancaria;

import java.util.Scanner;

public class Titular {
		Scanner sc=new Scanner(System.in);
		private String dni;
		private String nombre;
		private String apellido;
		private String telefono;
		public Titular() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Titular(String dni, String nombre, String apellido, String telefono) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.telefono = telefono;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		@Override
		public String toString() {
			return "Titular [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
		}

		public void crearTitular() {
			System.out.println("dime el DNI");
			dni=sc.next();
			System.out.println("Dime el nombre");
			nombre=sc.next();
			System.out.println("Dime el apellido");
			apellido=sc.next();
			System.out.println("por ultimo, dime su telefono");
			telefono=sc.next();
			System.out.println("La clase se ha creado con exito");
			
				
		
			
		}
		public void borrarTitular() {
			dni=null;
			nombre=null;
			apellido=null;
			telefono=null;
		}
	}

