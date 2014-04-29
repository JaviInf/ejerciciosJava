package com.javi.juegos.numeros;

import java.util.Random;
import java.util.Scanner;

import com.javi.juegos.Juego;
import com.javi.juegos.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	private int numeroAdivinar;
	boolean detenerPartida;

	public JuegoAdivinaNumero(int numVidas) {
		super(numVidas);
		 Random aleatorio = new Random();
	     numeroAdivinar = aleatorio.nextInt(11);
	     System.out.println("numero aleatorio   ....: "+numeroAdivinar);
		
	}

	public void juega() {

		this.reiniciaPartida();

		while (!detenerPartida) {
			System.out.println("Adivina el numero secreto entre 1 y 10");
			Scanner entrada = new Scanner(System.in);
			int numEntrada = entrada.nextInt();

			if (!this.validaNumero(numEntrada)) {
				numEntrada = entrada.nextInt();
			}
			if (numEntrada == this.numeroAdivinar) {
				System.out.println("Acertaste");
				this.actualizarRecord();
				this.detenerPartida=true;
			} else {
				if (this.quitaVidas()) {
					if (numEntrada > this.numeroAdivinar)
						System.out.println("El numero secreto es menor");
					else
						System.out.println("El numero secreto es mayor");
				}
				else{
					detenerPartida=true;
				}
			}

		}
	}

	public boolean validaNumero(int num) {
		return true;
	}

	@Override
	public void muestraNombre() {
		System.out.println("Adivina un numero.");
	}

	@Override
	public void muestraInfo() {
		 System.out.println("Acierta el numero secreto, debes ir metiendo probando hasta acertarlo o que quedarte sin intentos.");
		this.muestraVidasRestantes();
	}
	
	public void reiniciarPartida(){
		super.reiniciaPartida();
		Random numero= new Random();
		numeroAdivinar=numero.nextInt(11);
		 System.out.println("Nuevo numero a adivinar"+numeroAdivinar);
	}
	
	public int getNumeroAdivinar(){
		return this.numeroAdivinar;
	}
	public void setNumeroAdivinar(int n){
		 this.numeroAdivinar=n;
	}

}
