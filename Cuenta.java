package CuentaBancaria;

import java.util.Arrays;
import java.util.Scanner;

public class Cuenta {
	static Scanner sc=new Scanner(System.in);
	private String numero_cuenta;
	private int saldo;
	private Titular titular;
	
	

	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Cuenta(String numero_cuenta, int saldo, Titular titular) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.saldo = saldo;
		this.titular = titular;
	}
	


	public static Scanner getSc() {
		return sc;
	}


	public static void setSc(Scanner sc) {
		Cuenta.sc = sc;
	}


	public String getNumero_cuenta() {
		return numero_cuenta;
	}


	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public Titular getTitular() {
		return titular;
	}


	public void setTitular(Titular titular) {
		this.titular = titular;
	}


	@Override
	public String toString() {
		return "Cuenta [numero_cuenta=" + numero_cuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}


	public void  opciones(){
		System.out.println("Para retirar dinero pulse 1");
		System.out.println("Para ingresar dinero pulse 2");
		System.out.println("Para aniadir un titular pulse 3");
		System.out.println("Para borrar un titular pulse 4");
	}
	public void retirar20() {

			saldo=saldo-20;
		}
	public void retirar60() {

		saldo=saldo-60;
	}
	public void retirar100() {

		saldo=saldo-100;
	}
	public void retirar200() {

		saldo=saldo-200;
	}
	public void retirarotracantidad(int cantidaddeseada) {

		saldo=saldo-cantidaddeseada;
	}

			}
			
		
	

