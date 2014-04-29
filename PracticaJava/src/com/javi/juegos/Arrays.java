package com.javi.juegos;

import java.util.Scanner;

import com.javi.juegos.interfaces.Jugable;
import com.javi.juegos.numeros.JuegoAdivinaImpar;
import com.javi.juegos.numeros.JuegoAdivinaNumero;
import com.javi.juegos.numeros.JuegoAdivinaPar;

public class Arrays {

	public static Jugable eligeMetodo() {

//		JuegoAdivinaNumero juegoNumero = new JuegoAdivinaNumero(5, 9);
//		JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(5, 8);
//		JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(5, 3);
		
		JuegoAdivinaNumero juegoNumero = new JuegoAdivinaNumero(5);
		JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(5);
		JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(5);

		Jugable[] arrayJuegos = new Jugable[3];

		arrayJuegos[0] = juegoNumero;
		arrayJuegos[1] = juegoPar;
		arrayJuegos[2] = juegoImpar;

		System.out.println("@@@####@@@@@@######@@@@@@");
		System.out
				.println("Menu del super Juego:  (introduce un numero del 0 al 2)");
		System.out.println("@@@####@@@@@@######@@@@@@");
		System.out.println("0----> Juego Adivina Numero");
		System.out.println("1----> Juego Adivina Numero PAR");
		System.out.println("2----> Juego Adivina Numero IMPAR");

		Scanner entrada = new Scanner(System.in);
		int opcion = entrada.nextInt();

		while (opcion > 2 || opcion < 0) {
			System.out.println("Introduce un numero de entrada valido");
			opcion = entrada.nextInt();
		}
		

		return arrayJuegos[opcion];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugable juego = eligeMetodo();

		juego.muestraNombre();

		juego.muestraInfo();

		juego.juega();

		boolean seguirJugando = true;
		while (seguirJugando == true) {
			System.out.println("ÀSeguir jugando?");

//			String entrada = Teclado.LeeCadena();
			String entrada="";

			if (entrada.equals("si") || entrada.equals("SI") || entrada.equals("Si")) {
				seguirJugando = true;
				Jugable juego2 = eligeMetodo();

				juego2.muestraNombre();

				juego2.muestraInfo();

				juego2.juega();
			} else {
				seguirJugando = false;
			}
		}
	}
}
