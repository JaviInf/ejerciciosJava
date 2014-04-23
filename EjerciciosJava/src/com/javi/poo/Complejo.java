package com.javi.poo;

public class Complejo {

	private double pReal;
	private double pImag;
	private static int contador=0;
	
	public Complejo() {
		this.pReal=1.0;
		this.pImag=1.0;
		contador=contador+1;
		
	}

	public Complejo( double x, double y) {
		this.pReal=x;
		this.pImag=y;
		contador=contador+1;
	}

	public void asignar(double x, double y){
		this.pReal=x;
		this.pImag=y;
	}
	public void sumar(Complejo b){
		this.pReal=this.pReal+b.pReal;// privado pero deja acceder pork es de la misma clase
		this.pImag=this.pImag+b.pImag;
	}
	@Override
	public String toString(){
		return "("+this.pReal+", "+this.pImag+")";
	}
	
	public static Complejo sumar(Complejo a, Complejo b){
		Complejo resultado= new Complejo(a.pReal, a.pImag);
		resultado.sumar(b);
		return resultado;
	}
	public static int numeroInstancias(){
		return contador;
	}
	
	public int numeroInstancias1(){
		return contador;
	}
	
	public  boolean equals(Complejo a){
		 return (this.pReal== a.pReal && this.pImag==a.pImag); // return this==c comprueba si es el mismo objeto
	}
	
}
