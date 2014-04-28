package com.javi.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.javi.juegos.Juego;

public class PracticaJava {
	
	Juego juego;

	@Before
	public void setUp() throws Exception {
		juego=new Juego(5);
	}

	@Test
	public void testNumeroVidasRestantes() {
		assertEquals("Juego",5, juego.obtenVidasRestantes());
	}
	@Test
	public void testRestarVidayMostrar(){
	///	juego.numVidas--;
		//assertEquals("Juego", 4, juego.obtenVidasRestantes());
	}
	
	@Test
	public void testNuevaInstancia(){
		Juego nuevojuego=new Juego(5);
		assertEquals("Juego", 5, nuevojuego.obtenVidasRestantes());
	//	juego.numVidas--;
	//	assertEquals("Juego", 4, juego.obtenVidasRestantes());
	}
	
	@Test
	public void testQuitaVida(){
		assertEquals("Juego", 5, juego.obtenVidasRestantes());
		juego.quitaVidas();
		assertEquals("Juego", 4, juego.obtenVidasRestantes());
	}
	
	@Test
	public void testReiniciaPartida(){
		assertEquals("Juego", 5, juego.obtenVidasRestantes());
		juego.quitaVidas();
		assertEquals("Juego", 4, juego.obtenVidasRestantes());
		juego.reiniciaPartida();
		assertEquals("Juego", 5, juego.obtenVidasRestantes());
	}
	
	@Test
	public void actualizaRecord(){ // 3 casos 1-record igualado   2-record superado    3-nada
		juego.quitaVidas();
		// pruebo que actualiza record
		assertEquals("Juego", 4, juego.obtenVidasRestantes());
		assertEquals("Juego", "Se ha actualizado el record: "+"4" , juego.actualizarRecord());
		
		//puebo que no hace nada en tercer caso
		Juego nuevo=new Juego(3);
		assertEquals("Juego", "" , nuevo.actualizarRecord());
		
		// pruebo que iguala record
		Juego nuevoEmpate=new Juego(4);
		assertEquals("Juego", "Se ha alcanzado el record" , nuevoEmpate.actualizarRecord());

	}
	
	
	
	

}
