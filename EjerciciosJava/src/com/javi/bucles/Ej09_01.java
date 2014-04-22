package com.javi.bucles;

import java.util.Scanner;

public class Ej09_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero: ");
		int numero= entrada.nextInt();
		int factorial = 1;
	
		while ( numero!=0) {
			  factorial=factorial*numero;
			  numero--;
			}
		System.out.println("El factorial del numero es: "+factorial);
	}
}
