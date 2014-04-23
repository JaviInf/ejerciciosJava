package com.javi.claseEstandar;

import java.util.Scanner;

public class Nif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el dni: ");
		Scanner entrada = new Scanner(System.in);
		String nif = entrada.next();
		
		Dni dni=new Dni(nif);
		System.out.println(dni.comprobarNumero());

	}
	
	

}
