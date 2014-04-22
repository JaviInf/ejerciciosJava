package com.javi.arrays;

import java.util.Arrays;

public class Ej18_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector1[]=new int[10];
		int vector2[]=new int[10];
		int vector[]=new int[vector1.length+vector2.length];
		int aleatorio1, aleatorio2;
		
		for (int i=0; i<10; i++){
			aleatorio1  = (int) (100*Math.random()+1);
			aleatorio2  = (int) (100*Math.random()+1);
			vector1[i]=aleatorio1;
			vector2[i]=aleatorio2;
		}
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));
		
		System.arraycopy(vector1, 0, vector, 0, vector1.length);
		System.arraycopy(vector2, 0, vector, vector2.length, vector2.length);
		System.out.println(Arrays.toString(vector));
	}

}
