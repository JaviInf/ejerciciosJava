package com.javi.funciones;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class Ej22_01 {

	
	static boolean esPrimo (int numero){
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
		  if (numero % contador == 0)
		    primo = false;
		  contador++;
		}
		return primo;
	}
	
	
	 static Object[] calcularPrimos(int numero){
		int contador = 2;
		Vector<Integer> v= new Vector<Integer>();
		while (contador!=numero){
		  if (esPrimo(contador))
		    v.add(contador);
		  contador++;
		}
		System.out.println();
		return v.toArray();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Object[] vec=calcularPrimos(89);
      System.out.println(Arrays.toString(vec));
	}

}
