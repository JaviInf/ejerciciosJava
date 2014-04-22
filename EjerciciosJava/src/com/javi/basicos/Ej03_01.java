package com.javi.basicos;

import java.util.Scanner;

public class Ej03_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Ejercicio 3, dame el radio: ");
		Scanner entrada = new Scanner(System.in);
		int radio = entrada.nextInt();
		

		double volumenEsfera=(4/3)*Math.PI*Math.pow(radio, 3);
		double superficieEsfera=4*Math.PI*Math.pow(radio, 2);
		System.out.println("El volumen de la esfera: "+volumenEsfera+ "y la superficie: "+superficieEsfera);
	}

}
