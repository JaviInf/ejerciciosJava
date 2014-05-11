package com.javi.profesor;


import java.util.Scanner;

public class Teclado {

	public Teclado() {
		// TODO Auto-generated constructor stub
	}
	

	public int leerEntero(){
		int entero=0;
		Scanner entrada=new Scanner(System.in);
        try {
            entero = Integer.parseInt( entrada.next());
        } catch( NumberFormatException e ) {
        	  System.out.println(" Debes introducir un numero correcto. Vuelve a intentarlo:");
        	  leerEntero();
        }
        catch (Exception e){
        	  entero = 0;
        }
 
        return entero;
   
	}
	
	
}
