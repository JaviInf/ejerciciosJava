package com.javi.poo;

public class Complejo {

	private double pReal;
	private double pImag;
	
	public Complejo() {
	}

	public Complejo( double x, double y) {
		this.pReal=x;
		this.pImag=y;
	}

	public void asignar(double x, double y){
		this.pReal=x;
		this.pImag=y;
	}
	public void sumar(Complejo b){
		this.pReal=this.pReal+b.pReal;
		this.pImag=this.pImag+b.pImag;
	}
	
	public String toString(){
		return this.pReal+", "+this.pImag;
		
	}
	
	public static  Complejo sumar(Complejo a, Complejo b){
		Complejo resultado= new Complejo(a.pReal, a.pImag);
		resultado.sumar(b);
		return resultado;
		
	}
	
}
