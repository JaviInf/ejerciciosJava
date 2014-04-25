package com.javi.herencia;

public class Empresa {
	private String nombre;
	private final int tama–o;
	private IEmpleado vectorEmpleados[];
	private static int contador=0;
	
	public static int getContador() {
		return contador;
	}

	public static void incContador() {
		Empresa.contador++;
	}

	public Empresa(String nombre, int tama–o) {
		this.nombre=nombre;
		this.tama–o=tama–o;
		this.vectorEmpleados=new IEmpleado[tama–o];
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getTama–o() {
		return tama–o;
	}
	
	public  IEmpleado getEmpleado(int numEmpleado){
		return this.vectorEmpleados[numEmpleado];
	}
	
	public void despideEmpleado(int numEmpleado){
		this.vectorEmpleados[numEmpleado]=null;
		
	}
	

}
