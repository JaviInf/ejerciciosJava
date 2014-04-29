package com.javi.test;

import static org.junit.Assert.*;

import java.util.Scanner;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import com.javi.juegos.Juego;
import com.javi.juegos.VectorJugable;
import com.javi.juegos.interfaces.Jugable;
import com.javi.juegos.numeros.JuegoAdivinaImpar;
import com.javi.juegos.numeros.JuegoAdivinaNumero;
import com.javi.juegos.numeros.JuegoAdivinaPar;

public class PracticaJava {
	
	JuegoAdivinaNumero juego;

	@Before
	public void setUp() throws Exception {
	//	juego=new JuegoAdivinaNumero(5, 0);
	}

//	@Test
//	public void testNumeroVidasRestantes() {
//		assertEquals("Juego",5, juego.obtenVidasRestantes());
//	}
//	@Test
//	public void testRestarVidayMostrar(){
//		juego.numVidas--;
//		assertEquals("Juego", 4, juego.obtenVidasRestantes());
//	}
//	
//	@Test
//	public void testNuevaInstancia(){
//		Juego nuevojuego=new Juego(5);
//		assertEquals("Juego", 5, nuevojuego.obtenVidasRestantes());
//		juego.numVidas--;
//		assertEquals("Juego", 4, juego.obtenVidasRestantes());
//	}
//	
//	@Test
//	public void testQuitaVida(){
//		assertEquals("Juego", 5, juego.obtenVidasRestantes());
//		juego.quitaVidas();
//		assertEquals("Juego", 4, juego.obtenVidasRestantes());
//	}
//	
//	@Test
//	public void testReiniciaPartida(){
//		assertEquals("Juego", 5, juego.obtenVidasRestantes());
//		juego.quitaVidas();
//		assertEquals("Juego", 4, juego.obtenVidasRestantes());
//		juego.reiniciaPartida();
//		assertEquals("Juego", 5, juego.obtenVidasRestantes());
//	}
//	
//	@Test
//	public void actualizaRecord(){ // 3 casos 1-record igualado   2-record superado    3-nada
//		juego.quitaVidas();
//		 pruebo que actualiza record
//		assertEquals("Juego", 4, juego.obtenVidasRestantes());
//		assertEquals("Juego", "Se ha actualizado el record: "+"4" , juego.actualizarRecord());
//		
//		//puebo que no hace nada en tercer caso
//		Juego nuevo=new Juego(3);
//		assertEquals("Juego", "" , nuevo.actualizarRecord());
//		
//		// pruebo que iguala record
//		Juego nuevoEmpate=new Juego(4);
//		assertEquals("Juego", "Se ha alcanzado el record" , nuevoEmpate.actualizarRecord());
//
//	}
	
	
	//juegoAdivinaPar
		@Test
		public void testJuegoAdivinaNum(){
//			JuegoAdivinaNumero juegoNumero= new JuegoAdivinaNumero(2, 10);
//			assertTrue(juegoNumero.validaNumero(2));
//			assertTrue(juegoNumero.validaNumero(3));
			
		}
		
	
	//juegoAdivinaPar
	@Test
	public void testJuegoAdivinaPar(){
//		JuegoAdivinaPar juegoPar= new JuegoAdivinaPar(2, 10);
//		
//		assertTrue(juegoPar.validaNumero(2));
//		assertFalse(juegoPar.validaNumero(3));
		
	}
	
	//juegoAdivinaImar
	
	@Test
	public void testJuegoAdivinaImpar(){
//		JuegoAdivinaImpar juegoImpar= new JuegoAdivinaImpar(2, 10);
//		assertTrue(juegoImpar.validaNumero(3));
//		assertFalse(juegoImpar.validaNumero(2));
	}
	
//public static Jugable eligeMetodo(){
		
//		JuegoAdivinaNumero juegoNumero= new JuegoAdivinaNumero(5);
//		JuegoAdivinaPar juegoPar= new JuegoAdivinaPar(5);
//		JuegoAdivinaImpar juegoImpar= new JuegoAdivinaImpar(5);
//		
		Jugable[] arrayJuegos= new Jugable[3];
//		
//		arrayJuegos[0]=juegoNumero;
//		arrayJuegos[1]=juegoPar;
//		arrayJuegos[2]=juegoImpar;
//		
//		System.out.println("@@@####@@@@@@######@@@@@@");
//		System.out.println("Menu del super Juego:  (introduce un numero del 0 al 2)");
//		System.out.println("@@@####@@@@@@######@@@@@@");
//		System.out.println("0----> Juego Adivina Numero");
//		System.out.println("1----> Juego Adivina Numero PAR");
//		System.out.println("2----> Juego Adivina Numero IMPAR");
//		System.out.println("");
//		
//		Scanner entrada= new Scanner(System.in);
//		int opcion= entrada.nextInt();
//
//		while (opcion>2 || opcion<0){
//			System.out.println("Introduce un numero de entrada valido");
//			opcion= entrada.nextInt();
//		}
//		
//		return arrayJuegos[opcion];
//	}
	
	@Test
	public void testArrayInterfaces(){
//		Jugable juego=this.eligeMetodo();
//		//con el uno
//		Jugable jugable;
//		assertNotNull("Juego",juego);
	}
	
	@Test
	public void testVectorInterfaces(){
		
		JuegoAdivinaNumero juegoNumero = new JuegoAdivinaNumero(5);
		JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(5);
		JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(5);

		Vector<Jugable> vectorJuegos = new Vector<Jugable>();
		vectorJuegos.add(juegoNumero);
		vectorJuegos.add(juegoPar);
		vectorJuegos.add(juegoImpar);
		VectorJugable.infoVector(vectorJuegos);
		assertEquals("VectorJugable", "Tama–o del vector: 3 Capacidad del vector: 10", juego.obtenVidasRestantes());
		
		
	}
	

}
