package caculadora;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTest {
	
	
	Calculadora calculadoraTest= new Calculadora();
	
	@Test 
	public void testSuma() {
		double num=2.0;
		double num2=1.0;
		double resultadoEsperado=3.0;
		double resultado = calculadoraTest.suma(num2, num);
		assertEquals(resultadoEsperado, resultado);
	}
	@Test 
	public void testResta() {
		double num=2.0;
		double num2=1.0;
		double resultadoEsperado=1.0;
		double resultado = calculadoraTest.resta(num2, num);
		assertEquals(resultadoEsperado, resultado);
	}
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testPotencia() {
		double num=2.0;
		double num2=1.0;
		double resultadoEsperado=2.0;
		double resultado = calculadoraTest.potencia(num, num2);
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void testPotenciaNegativos() {
		double num=-2.0;
		double num2=2.0;
		double resultadoEsperado=2.0;
		double resultado = calculadoraTest.potencia(num, num2);
		assertEquals(resultadoEsperado, resultado);
	}

}
