package com.javi.juegos;

public abstract class Juego {
	
private int numVidas;
private final int  numVidasInicio;
private static int record=0;

	public Juego( int numVidas) {
		this.numVidas=numVidas;
		this.numVidasInicio=numVidas;
	}
	
	public void muestraVidasRestantes() {
		System.out.println("El numero de vidas que te quedan: " +numVidas);
	}
	public int obtenVidasRestantes() {
		return numVidas;
	}
	
	public boolean quitaVidas(){
		numVidas--;
		if (numVidas==0){
			System.out.println(" Juego Terminado ");
			return false;
		}
		else return true;
	}
	
	public void reiniciaPartida(){
		this.numVidas=this.numVidasInicio;
	}

	public String actualizarRecord(){
		String salida="";
		if(this.numVidas==record){
			salida="Se ha alcanzado el record";
			System.out.println(salida);
			return salida;
		}
		else if ( this.numVidas>record){
			record=this.numVidas;
			salida="Se ha actualizado el record: "+record;
			System.out.println(salida);
			return salida;
		}
		else return salida;
	}
	
//	public abstract void juega();
	
}
