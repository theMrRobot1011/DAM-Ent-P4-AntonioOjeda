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
	@Test
	public void comprobarSuma() {
		assertEquals(9,numero.suma());
	}
	@Test
	public void comprobarResta() {
		assertEquals(-1,numero.resta());
	}
	@Test
	public void comprobarMulitplicacion() {
		assertEquals(20,numero.multiplicar());
	}
	@Test
	public void comprobarDivision() {
		assertEquals(0,numero.dividir());
	}
	@Test
	public void comprobarPotencia() {
		assertEquals(1024,numero.potencia());
	}
	@Test
	public void comprobarMultiplo() {
		assertEquals(false,numero.multiplo());
	}
}
