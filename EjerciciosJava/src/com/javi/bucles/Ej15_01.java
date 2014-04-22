package com.javi.bucles;

import java.util.Scanner;

public class Ej15_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio  = (int) (100*Math.random()+1);
		System.out.println("Numero secreto"+aleatorio);
		
		int cont=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero: ");
		
		int numero = entrada.nextInt();
		Boolean acertado=false;
		
		while (cont<4 && !acertado) {
			if(numero==aleatorio) {
				System.out.println("Premio!!! has acertado el numero secreto");
				acertado=true;
			}
			else
			{
				cont++;
				System.out.println("Error: introduce otro, te quedan " + (5-cont) +"intentos");
				if(numero>aleatorio) System.out.println("Pista: el numero es menor");
				else System.out.println("Pista: el numero es mayor");
				numero = entrada.nextInt();
			}
			
		}
	}

}
