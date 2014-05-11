package com.javi.juegos.numeros;

import com.javi.juegos.interfaces.Jugable;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero implements Jugable{

	public JuegoAdivinaImpar(int numVidas) {
		super(numVidas);
	}

	public boolean validaNumero(int num){
		if(num % 2!=0) return true;
		else {
			System.out.println("Error");
			return false;
		}
	}
	
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un numero impar.");
		// TODO Auto-generated method stub
		
	}


	@Override
	public void muestraInfo() {
		 System.out.println("Acierta el numero secreto (impar), debes ir metiendo probando hasta acertarlo o que quedarte sin intentos.");
		this.muestraVidasRestantes();
	
		
		// TODO Auto-generated method stub
		
	}
	
	public void reiniciaPartida()
    {
         
        super.reiniciaPartida();
         
        int numero=this.getNumeroAdivinar();
         
        if(numero%2==0)
        {
        	numero=numero+1;
        	this.setNumeroAdivinar(numero);
        	System.out.println("Nuevo numero secreto IMPAR: "+this.getNumeroAdivinar());
        }   
    }
	
	
}
