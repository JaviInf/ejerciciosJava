package com.javi.profesor;


import java.util.Scanner;

public abstract class Teclado {


	public static int leerEntero(){
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
