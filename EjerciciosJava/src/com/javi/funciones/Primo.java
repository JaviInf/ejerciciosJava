package com.javi.funciones;

import java.util.Vector;

public class Primo {
	
	 boolean esPrimo (int numero){
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
		  if (numero % contador == 0)
		    primo = false;
		  contador++;
		}
		return primo;
	}
	
	
	  Object[] calcularPrimos(int numero){
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
}
