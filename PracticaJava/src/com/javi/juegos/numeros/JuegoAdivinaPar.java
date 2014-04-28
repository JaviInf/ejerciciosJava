package com.javi.juegos.numeros;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

	public JuegoAdivinaPar(int numVidas, int numeroAdivinar) {
		super(numVidas, numeroAdivinar);
		// TODO Auto-generated constructor stub
	}
	
	public boolean validaNumero(int num){
		if(num % 2==0) return true;
		else {
			System.out.println("Error");
			return false;
		}
	}

}
