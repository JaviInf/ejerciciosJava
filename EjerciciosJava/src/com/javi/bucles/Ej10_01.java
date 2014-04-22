package com.javi.bucles;

public class Ej10_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float celsius;		
		for(int i=0; i<=300; i=i+20){
			celsius=(float) ((i-32)*(0.5555));
			System.out.println("Fahrenheit: " +i +" Celsius: "+celsius);
		}
	}

}
