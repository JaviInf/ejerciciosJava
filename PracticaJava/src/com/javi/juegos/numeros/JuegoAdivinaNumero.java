package com.javi.juegos.numeros;

import java.util.Scanner;

import com.javi.juegos.Juego;
import com.javi.juegos.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable {
	
	private final int numeroAdivinar;

	public JuegoAdivinaNumero( int numVidas, int numeroAdivinar) {
		super(numVidas);
		this.numeroAdivinar=numeroAdivinar;
	}


	public void juega() {
		
		this.reiniciaPartida();
		System.out.println("Adivina el numero secreto entre 1 y 10");
		Scanner entrada= new Scanner(System.in);
		int numEntrada=entrada.nextInt();
		
		if(numEntrada==this.numeroAdivinar){
			System.out.println("Acertaste");
			this.actualizarRecord();
		}
		else{
			if(this.quitaVidas()){
				if(numEntrada>this.numeroAdivinar) System.out.println("El numero secreto es menor");
				else System.out.println("El numero secreto es mayor");
			}
		}	
	}
	
	public boolean validaNumero(int num){
		return true;
	}


	@Override
	public void muestraNombre() {
		System.out.println("Adivina un numero.");
		// TODO Auto-generated method stub
		
	}


	@Override
	public void muestraInfo() {
		this.muestraVidasRestantes();
	
		
		// TODO Auto-generated method stub
		
	}

}
