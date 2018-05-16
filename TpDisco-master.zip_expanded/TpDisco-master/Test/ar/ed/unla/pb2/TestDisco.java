package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisco {

	@Test
	public void testQueCalculaPerimtroExterno() {
		Disco miDisco=new Disco(1.0,2.0);
		Double ve=miDisco.calucularPerimetroExterior();
		Double vo=4*Math.PI;
		assertEquals(ve, vo, 3);
	}
	@Test
	public void testQueCalculaPerimtroInterno() {
		Disco miDisco=new Disco(1.0,2.0);
		Double ve=miDisco.calucularPerimetroInterno();
		Double vo=2*Math.PI;
		assertEquals(ve, vo, 3);
	}
	@Test
	public void testQueCalculaSuperficie() {
		Disco miDisco=new Disco(1.0,2.0);
		Double ve=miDisco.calcularSuperficie();
		Double vo=9.4;
		assertEquals(ve,vo,1);
		
	}
	@Test
	public void testQueCambiaElRadioExterior() {
		Disco miDisco=new Disco(1.0,2.0);
		miDisco.setRadioExterior(5.0);
		Double ve=5.0;
		assertEquals(ve,miDisco.getRadioExterior());
	}
	@Test
	public void testQueCambiaElRadiointerno() {
		Disco miDisco=new Disco(1.0,2.0);
		miDisco.setRadioInterior(8.0);
		Double ve=8.0;
		assertEquals(ve,miDisco.getRadioInterior());
		
	}
	
}
