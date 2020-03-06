package test.java.liceosorolla;

import main.java.liceosorolla.Numero;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class NumeroTest {
	private Numero numero;
	@Before
	public void Before() {
		numero = new Numero(4,5);
	}
	@Test
	public void comprobarNumero1() {
		int numero1=4;
		assertEquals(numero1,numero.getNumero1());
	}
	@Test
	public void comprobarNumero2() {
		int numero1=5;
		assertEquals(numero1,numero.getNumero2());
	}
}
