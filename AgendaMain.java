package agenda;

import java.util.Iterator;
import java.util.Scanner;

public class AgendaMain {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListadoContactos agenda=new ListadoContactos();
		 
		
		System.out.println("Buenas, estas en tu agenda telefónica, que operación desea realizar");
		int eleccion=0;
		do {
		System.out.println("1. Añadir un contacto");
		System.out.println("2.Eliminar un contacto");
		System.out.println("3.Verificar un contacto");
		System.out.println("4.Mostrar el listado de contactos");
		System.out.println("5.Buscar un contacto");
		System.out.println("6.Salir");
		System.out.println("7. hola");
		eleccion=sc.nextInt();
		switch(eleccion) {
			
		
		
		case 1:
				Contacto c = new Contacto();
                 c.annadirDatosContacto();
                if(agenda.annadirContacto(c)){
                 System.out.println("Se ha añadido el contacto con exito");
                 }else
                	 System.out.println("El contacto ya existe");
                 System.out.println("");
                 break;
			
			
			
			case 2:
				System.out.println("Introduce el nombre del contacto que quieres eliminar");
				String nombre=sc.next();
				if(agenda.eliminarContacto(nombre)) {
				System.out.println("Se ha eliminado el contacto correctamente");
				}else
					System.out.println("El contacto no existe");
				
				System.out.println("");
				break;
				
			
			
			case 3:
				System.out.println("dame el nombre del contacto que quieres verificar");
				nombre=sc.next();
				if(agenda.existeContacto(nombre)) {
					System.out.println("Existe en tu agenda de contactos");
				}else
					System.out.println("El contacto no existe");
				System.out.println("");
				break;
			
			
			
			case 4:
				agenda.listarContactos();
				System.out.println("");
				break;
			
			
			
			case 5:
				System.out.print("Escribe el nombre del contacto que quieres buscar: ");
				nombre=sc.next();
				agenda.buscaContacto(nombre);
				System.out.println("");
				break;
			
			
			
			case 6:
				System.out.println("Ha salido con éxito");
				break;
			
			
			
			default:
				System.out.println("Por favor, introduce una opcion valida");
				
					
				
				
		}
		
		

	}while(eleccion!=6);

}
	}
