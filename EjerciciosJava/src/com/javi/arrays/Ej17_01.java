package com.javi.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej17_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int vector[]=new int[10];
		for (int i=0; i<10; i++){
			int numero=entrada.nextInt();
			vector[i]=numero;
//			System.out.println(" vector original" +vector[i]);
		}
		 System.out.println(Arrays.toString(vector));
		int vectorDadoVuelta[]= new int[10];
		  for(int i=0; i<vector.length; i++){ 
		         vectorDadoVuelta[i]=vector[vector.length-1-i]; 
		         
		  } 
		  System.out.println(Arrays.toString(vectorDadoVuelta));
		  boolean b=Arrays.equals(vector, vectorDadoVuelta);
		  System.out.println(b);
		
		
	}

}
