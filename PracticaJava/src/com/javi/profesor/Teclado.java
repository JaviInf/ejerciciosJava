package com.javi.profesor;


import java.util.Scanner;

public class Teclado {

	public Teclado() {
		// TODO Auto-generated constructor stub
	}
	

	public int leerEntero(){
		int entero;
		Scanner entrada=new Scanner(System.in);
        try {
            entero = Integer.parseInt( entrada.next());
        } catch( Exception e ) {
           entero = 0;
        }
 
        return entero;
   
	}
	
	
}
