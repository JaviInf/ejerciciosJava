package com.javi.juegos.numeros;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

	public JuegoAdivinaImpar(int numVidas, int numeroAdivinar) {
		super(numVidas, numeroAdivinar);
	}

	public boolean validaNumero(int num){
		if(num % 2!=0) return true;
		else {
			System.out.println("Error");
			return false;
		}
	}
	
}
