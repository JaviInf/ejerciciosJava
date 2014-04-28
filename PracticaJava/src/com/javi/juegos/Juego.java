package com.javi.juegos;

public class Juego {
	
public int numVidas;

	public Juego( int numVidas) {
		this.numVidas=numVidas;
	}
	
	public void muestraVidasRestantes() {
		System.out.println("El numero de vidas que te quedan: " +numVidas);
	}
	public int obtenVidasRestantes() {
		return numVidas;
	}
	
	
}
