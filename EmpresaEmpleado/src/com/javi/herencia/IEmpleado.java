package com.javi.herencia;

public interface IEmpleado {
	
	
	//Metodos getters
	public String getNombre();
	public double getSueldo();
	public int getNumEmpleado();
	
	// Metodos setters
	public void setNombre( String nuevoNombre);
	public void setSueldo(double sueldo);
	
	public String toString();
	
	public void aumentarSueldo(int n);
	
	public void despedir();
	
	
	
	

}
