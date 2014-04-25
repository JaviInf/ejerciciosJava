package com.javi.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.javi.herencia.Empleado;
import com.javi.herencia.Empresa;
import com.javi.herencia.IEmpleado;

public class TestEmpresaEmpleado {
	Empresa nuevaEmpresa;
	Empleado empleado;
	@Before
	public void setUp() throws Exception {
		nuevaEmpresa=new Empresa("xxx", 34);
		empleado=new Empleado(nuevaEmpresa, "Pepito", 10.000);
	
	}
	
	//EMPRESA
	@Test
	public void testGetNombre() {
		assertEquals("Empresa","xxx", nuevaEmpresa.getNombre());
	}
	@Test
	public void testGetNumero() {
		assertEquals("Empresa",34, nuevaEmpresa.getTama–o());
	}
	@Test
	public void testGetEmpleado() {
		//assertEquals("Empresa",IEmpleado, nuevaEmpresa.getEmpleado(0));
	}
	
	//EMPLEADOOOO
	@Test
	public void testDespideEmpleado() {
		//assertEquals("Empleado","Pepito", empleado.getNombre());
	}
	
	@Test
	public void testEmpleadogetNombre() {
		assertEquals("Empleado","Pepito", empleado.getNombre());
	}
	
	@Test
	public void testEmpleadogetSueldo() {
		assertEquals("Empleado",10.000, 0, empleado.getSueldo());
		
	}
	
	
	

}
