package com.javi.poo;

public class PruebaComplejo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creo un complejo 12,34");
		Complejo numero= new Complejo(12,34);
		System.out.println(numero.toString());
		
		System.out.println("Le asigno 34, 12");
		numero.asignar(34, 12);
		System.out.println(numero.toString());
		System.out.println("Le sumo 89,90");
		numero.sumar(new Complejo(89,90));
		System.out.println("Resultado de 89,90 a 34,12");
		System.out.println(numero.toString());
		
		System.out.println("Metodo estatico creo el 10,100 y 100,10 y sumo");
		
		Complejo a=new Complejo(10,100);
		Complejo b=new Complejo(100,10);
		System.out.println((Complejo.sumar(a, b)).toString());
		
		System.out.println("Numero de instancias creadas: "+Complejo.numeroInstancias());
		System.out.println("Numero de instancias creadas: "+numero.numeroInstancias1());
		
		
		
	}

}
