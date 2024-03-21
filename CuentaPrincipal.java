package CuentaBancaria;

import java.util.Scanner;

public class CuentaPrincipal {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin;
		int intentos=0;
		int opcion;
		Titular t1=new Titular("34C","Fernando","Moreno","897653123");
		Titular t2=new Titular();
		Titular t3= new Titular();
		Titular t4= new Titular();
		Cuenta cuenta1= new Cuenta("123456789", 5000, t1);
		String [] Titulares= {t1.toString(),null,null,null};
		
		System.out.println("Buenas " + t1.getNombre() +" introduce tu pin:");
		do {
			if (intentos==1) {
				System.out.println("Error al introducir el codigo le quedan 2 intentos, por favor intentelo de nuevo");
			}
			if (intentos==2) {
				System.out.println("Error al introducir el codigo le quedan 1 intento, por favor intentelo de nuevo");
			}
			if (intentos==3) {
				System.out.println("Se ha bloqueado su tarjeta");
			}
				
		pin=sc.nextInt();
		intentos++;

		}while(intentos!=3 && pin!=1234);

		if(pin==1234) {
			int otraoperacion=1;
			while (otraoperacion==1) {
			cuenta1.opciones();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
	
				System.out.println("Su saldo actual es de "+ cuenta1.getSaldo());
				System.out.println("¿Cuanto dinero quieres retirar?");
				System.out.println("Introduzca el numero 1 para retirar 20€");
				System.out.println("Introduzca el numero 2 para retirar 60€");
				System.out.println("Introduzca el numero 3 para retirar 100€");
				System.out.println("Introduzca el numero 4 para retirar 200€");
				System.out.println("Para cualquier otra cantidad, pulse 5 e introduzca la cantidad deseada");
				int cantidadRetirada=sc.nextInt();
				do {
				switch (cantidadRetirada) {
				case 1:
					System.out.println("Ha retirado 20€");
					System.out.println("Su saldo actual es de ");
					cuenta1.retirar20();
					System.out.println(cuenta1.getSaldo());
					break;
				case 2:
					
					System.out.println("Ha retirado 60€");
					System.out.println("Su saldo actual es de ");
					cuenta1.retirar60();
					System.out.println(cuenta1.getSaldo());
					break;
				case 3:
					
					System.out.println("Ha retirado 100€");
					System.out.println("Su saldo actual es de ");
					cuenta1.retirar100();
					System.out.println(cuenta1.getSaldo());
					break;
				case 4:
					
					System.out.println("Ha retirado 200€");
					System.out.println("Su saldo actual es de ");
					cuenta1.retirar200();
					System.out.println(cuenta1.getSaldo());
					break;
				case 5:
					System.out.println("Introduzca la cantidad que desea retirar");
					int cantidaddeseada=sc.nextInt();
					System.out.println("Ha retirado "+ cantidaddeseada);
					System.out.println("Su saldo actual es de ");
					cuenta1.retirarotracantidad(cantidaddeseada);
					System.out.println(cuenta1.getSaldo());
					break;
					default:
						System.out.println("Por favor, introduzca una opción valida");
				}
					
				}while(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=5);
			
					 
				
			
				break;
			case 2:
				System.out.println("¿Cuanto dinero desea ingresar?");
				int ingreso=sc.nextInt();
				int total=cuenta1.getSaldo();
				total=total+ingreso;
				cuenta1.setSaldo(total);
				System.out.println("Su saldo actual es de "+ cuenta1.getSaldo());
				
				break;
			case 3:
				boolean flag=true;
				if(Titulares[1]==null) {
					System.out.println("Vas a añadir un nuevo titular, por favor, facilitame sus datos");
					t2.crearTitular();
					Titulares[1]=t2.toString();
					flag=false;
					
				
				}
				if(Titulares[2]==null && flag) {
				System.out.println("Pulse 1 para añadir otro titular, pulse cualquier otra tecla para volver al menu");
				int hacert3=sc.nextInt();
				
				if(hacert3==1 && Titulares[2]==null) {
					System.out.println("Vas a añadir un nuevo titular, por favor, facilitame sus datos");
					t3.crearTitular();
					Titulares[2]=t3.toString();
					flag=false;
					}
				}
				
				if(Titulares[3]==null && flag) {
				System.out.println("Pulse 1 para añadir otro titular, pulse cualquier otra tecla para volver al menu");
				int hacert4=sc.nextInt();
				if(hacert4==1 && Titulares[3]==null) {
					System.out.println("Vas a añadir un nuevo titular, por favor, facilitame sus datos");
					
					t4.crearTitular();
					Titulares[3]=t4.toString();
				}
				}
				if(Titulares[3]!=null) {
					System.out.println("Ya no tienes espacio para añadir titulares, si quieres añadir otro, borra uno");
				}
				
				
				
				break;
				
			case 4:
				System.out.println("vas a borrar un titular de tu cuenta, ¿Cual quieres borrar?(1,2,3 o 4)");
				int borrartitular;
				int borrarotro;
				do {
				borrartitular=sc.nextInt();
				switch(borrartitular) {
				case 1:
					t1.borrarTitular();
					Titulares[0]=null;
					System.out.println("El titular ha sido borrado con exito");
					break;
				case 2:
					t2.borrarTitular();
					Titulares[1]=null;
					System.out.println("El titular ha sido borrado con exito");
					break;
				case 3:
					t3.borrarTitular();
					Titulares[2]=null;
					System.out.println("El titular ha sido borrado con exito");
					break;
				case 4:
					t4.borrarTitular();
					Titulares[3]=null;
					System.out.println("El titular ha sido borrado con exito");
					break;
				default:
					System.out.println("No es un titular válido. Introduzca un titular válido");
			
				}
				System.out.println("pulsa 1 si quieres borrar otro titular, pulsa otra tecla si quieres volver al menu");
				 borrarotro=sc.nextInt();
				}while(borrartitular!=1 && borrartitular!=2 && borrartitular!=3 && borrartitular!=4 || borrarotro!=1);
				
				
			
			
				
				
			}
			System.out.println("Si desea realizar otra operacion pulse 1 si no pulse cualquier otro numero");
			 otraoperacion=sc.nextInt();
			 if(otraoperacion!=1) {
				 System.out.println("Ha salido con exito del programa");
			 }
			 
			 
			 
			
				
				
			 }	
	
			
		
		
		} }}


