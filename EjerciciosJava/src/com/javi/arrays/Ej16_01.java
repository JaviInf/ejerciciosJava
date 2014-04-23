package com.javi.arrays;

import java.util.Scanner;

public class Ej16_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce 10 numeros");
		Scanner entrada=new Scanner(System.in);
		int vector[]=new int[10];
		for (int i=0; i<10; i++){
			int numero=entrada.nextInt();
			vector[i]=numero;
		}
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0; i<vector.length; i++) {
			System.out.println( "elemento "+i+ " "+vector[i]);
			if(vector[i]>=max) max=vector[i];
		    if (min>vector[i])  min=vector[i];
		}
		
		System.out.println("Numero maximo "+ max);
		System.out.println("Numero minimo "+ min);
	}
	
}
