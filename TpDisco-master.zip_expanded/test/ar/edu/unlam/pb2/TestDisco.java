package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisco {

	@Test
	public void testQueCalculaPerimetroExterior() {
		Disco miDisco=new Disco(1.0,2.0);
		Double valorEsperado=4*Math.PI;
		Double valorObtenido=miDisco.calcularPerimetroExterior();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void testQueCalculaPerimetroInterno() {
		Disco miDisco=new Disco(1.0,2.0);
		Double valorEsperado=2*Math.PI;
		Double valorObtenido=miDisco.calcularPerimetroInterno();
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void testQueCalculaSuperficie() {
		Disco miDisco=new Disco(1.0,2.0);
		Double valorEsperado=Math.PI*4-Math.PI;
		Double valorObtenido=miDisco.calcularSuperficie();
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void testQueCambiaElRadioExterior() {
		Disco miDisco=new Disco(1.0,3.0);
		miDisco.setRadioExterior(5.0);
		Double valorEsperado=5.0;
		assertEquals(valorEsperado,miDisco.getRadioExterior());
	}
	@Test
	public void testQueCambiaElRadiointerno() {
		Disco miDisco=new Disco(1.0,6.0);
		miDisco.setRadioInterior(8.0);
		Double valorEsperado=8.0;
		assertEquals(valorEsperado,miDisco.getRadioInterior());
	}

}
