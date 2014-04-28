package com.javi.juegos.numeros;

import com.javi.juegos.interfaces.Jugable;

public class JuegoAdivinaPar extends JuegoAdivinaNumero implements Jugable{

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
	
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un numero par.");
		// TODO Auto-generated method stub
		
	}


	@Override
	public void muestraInfo() {
		this.muestraVidasRestantes();
	
		
		// TODO Auto-generated method stub
		
	}
	

}
