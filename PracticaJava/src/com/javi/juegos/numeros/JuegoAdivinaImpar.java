package com.javi.juegos.numeros;

import com.javi.juegos.interfaces.Jugable;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero implements Jugable{

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
	
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un numero impar.");
		// TODO Auto-generated method stub
		
	}


	@Override
	public void muestraInfo() {
		this.muestraVidasRestantes();
	
		
		// TODO Auto-generated method stub
		
	}
	
	
}
