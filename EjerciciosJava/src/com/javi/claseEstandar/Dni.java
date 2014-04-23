package com.javi.claseEstandar;

public class Dni {
	
	private char letra;
	private int numero;
	
	public Dni(String dniCompleto) {
		this.letra = dniCompleto.charAt(dniCompleto.length()-1);
		this.numero=Integer.parseInt(dniCompleto.substring(0, dniCompleto.length()-1));
		System.out.println("Letra " + this.letra);
		System.out.println("numero " + this.numero);
		
	}
	
	public char calcularLetra(){
		    String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKET";
		    int modulo= this.numero % 23;
		    char letra = juegoCaracteres.charAt(modulo);
		    System.out.println("letra calculada : "+letra);
		    return letra; 
	}
	
	public boolean comprobarNumero(){
		if (this.numero>0 && this.numero<99999999){
			if (this.letra==this.calcularLetra()){
				System.out.println("DNI correcto");
				return true;
			}
			else {
				System.out.println("Letra incorrecta");
				return false;
			}
		}
		else return false;		
	}
}
