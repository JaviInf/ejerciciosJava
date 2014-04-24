package com.javi.fizzbuzz;

public class FizzBuzz {

	public String calcular( int num){
		String salida="";
		for( int i=1; i<=num; i++){
			if(multiplo3(i)) salida.concat(this.Fizz());
			if(i==1) salida.concat(String.valueOf(i));
			
		}
		return salida;	
		}
		
	

	
	public boolean multiplo3(int num){
		return (num %3==0);
	}
	
	public boolean multiplo5(int num){
		return (num %5==0);
	}
	
	public boolean multiplo15(int num){
		return (num %15==0);
	}
	public String Fizz(){
		return "Fizz";
	}
	
	public String Buzz(){
		return "Buzz";
	}
	
}
