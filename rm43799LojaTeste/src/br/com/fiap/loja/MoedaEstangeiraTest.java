package br.com.fiap.loja;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoedaEstangeiraTest 
{

	@Test
	public void testConverterDolarValorPositivo() {
		MoedaEstangeira converter = new MoedaEstangeira();
		int valoReal = converter.converterDolar(5);
		assertEquals("Calcular valor com 5 dolares", 10, valoReal);
		
	}

	@Test
	public void testConverterDolarValorZerado() {
		MoedaEstangeira converter = new MoedaEstangeira();
		int valoReal = converter.converterDolar(0);
		assertEquals("Calcular valor com 5 dolares", 0, valoReal);
		
	}

	@Test
	public void testConverterDolarValorNegativo() {
		MoedaEstangeira converter = new MoedaEstangeira();
		int valoReal = converter.converterDolar(-1);
		assertEquals("Calcular valor com 5 dolares", 0, valoReal);
		
	}
}