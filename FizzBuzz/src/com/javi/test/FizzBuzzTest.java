package com.javi.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.javi.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	FizzBuzz fb;
	
	@Before
	public void setUp() throws Exception {
		fb=new FizzBuzz();
	}
	
	@Test
	public void testDivisores3(){
		assertTrue(fb.multiplo3(3));
		assertTrue(fb.multiplo3(9));
		assertTrue(fb.multiplo3(12));
		assertFalse(fb.multiplo3(1));
	}
	
	@Test
	public void testDivisores5(){
		assertTrue(fb.multiplo5(5));
		assertTrue(fb.multiplo5(10));
		assertTrue(fb.multiplo5(15));
		assertFalse(fb.multiplo5(3));	
	}
	
	@Test
	public void testFizz(){
		assertEquals("FizzBuzz 1", "Fizz", fb.Fizz());
	}
	
	@Test
	public void testBuzz(){
		assertEquals("FizzBuzz 1", "Buzz", fb.Buzz());
	}
	
	@Test
	public void test() {
		assertEquals("FizzBuzz 1", "1", fb.calcular(1));
		assertEquals("FizzBuzz2", "1 2", fb.calcular(2));
		assertEquals("FizzBuzz3", "1 2 Fizz", fb.calcular(3));
		assertEquals("FizzBuzz4", "1 2 Fizz 4", fb.calcular(4));
		assertEquals("FizzBuzz5", "1 2 Fizz 4 Buzz", fb.calcular(5));
		assertEquals("FizzBuzz6", "1 2 Fizz 4 Buzz Fizz", fb.calcular(6));
		assertEquals("FizzBuzz7", "1 2 Fizz 4 Buzz Fizz 7", fb.calcular(7));
		assertEquals("FizzBuzz8", "1 2 Fizz 4 Buzz Fizz 7 8", fb.calcular(8));
		assertEquals("FizzBuzz9", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz", fb.calcular(9));
		assertEquals("FizzBuzz10", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz", fb.calcular(10));
		assertEquals("FizzBuzz11", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11", fb.calcular(11));
		assertEquals("FizzBuzz12", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz", fb.calcular(12));
		assertEquals("FizzBuzz13", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13", fb.calcular(13));
		assertEquals("FizzBuzz14", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14", fb.calcular(14));
		assertEquals("FizzBuzz15", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", fb.calcular(15));	
	}

}
