package com.javi.basicos;

import java.util.Scanner;

public class Ej06_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce altura: ");
		double altura = entrada.nextDouble();
		System.out.println("Introduce peso: ");
		double peso = entrada.nextDouble();
		double ims=peso/ Math.pow(altura,2);

		if(ims<16) System.out.println("Criterio de ingreso en hospital");
		else if(ims>16 && ims<17) System.out.println("Infrapeso");
		else if(ims>17 && ims<18) System.out.println("Bajo peso");
		else if(ims>18 && ims<25) System.out.println("Peso normal");
		else if(ims>25 && ims<30) System.out.println("Sobrepeso");
		else if(ims>30 && ims<35) System.out.println("Sobrepeso cr—nico");
		else if(ims>35 && ims<40) System.out.println("Obesidad prem—rbida");
		else if(ims>40) System.out.println("Obesidad m—rbida");
		

	}

}
