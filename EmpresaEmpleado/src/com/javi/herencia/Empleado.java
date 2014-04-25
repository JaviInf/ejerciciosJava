package com.javi.herencia;

public class Empleado implements IEmpleado {
	
	protected  final Empresa empresa;
	protected String nombre;
	protected double sueldo;
	protected final int numeroEmpleado;
	

	public Empleado(Empresa empresa, String nombre, double sueldo) {
		this.empresa=empresa;
		this.nombre=nombre;
		this.sueldo=sueldo;
		Empresa.incContador();
		this.numeroEmpleado=Empresa.getContador();
	}
	public Empleado(Empresa empresa, String nombre, int sueldo, int numeroEmpleado) {
		this.empresa=empresa;
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.numeroEmpleado=numeroEmpleado;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public double getSueldo() {
		return this.sueldo;
	}

	@Override
	public int getNumEmpleado() {
		return this.numeroEmpleado;
	}

	@Override
	public void setNombre( String nuevoNombre) {
	this.nombre=nuevoNombre;
		
	}

	@Override
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
		
	}

	@Override
	public void aumentarSueldo(int n) {
		this.sueldo+=n/100*this.sueldo;
	}

	@Override
	public void despedir() {
		
	}

}
