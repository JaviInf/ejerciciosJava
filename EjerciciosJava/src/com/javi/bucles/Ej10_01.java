package com.javi.bucles;

public class Ej10_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int celsius=0;		
		for(int i=0; i<=300; i=i+20){
			celsius=(5/9)*(i-32);
			System.out.println("Fahrenheit: " +i +" Celsius: "+celsius);
		}
	}

}
