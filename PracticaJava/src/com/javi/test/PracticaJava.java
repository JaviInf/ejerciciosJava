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
		juego.numVidas--;
		assertEquals("Juego", 4, juego.obtenVidasRestantes());
	}
	
	@Test
	public void testNuevaInstancia(){
		Juego nuevojuego=new Juego(5);
		assertEquals("Juego", 5, nuevojuego.obtenVidasRestantes());
		juego.numVidas--;
		assertEquals("Juego", 4, juego.obtenVidasRestantes());
	}

}
