package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import main.java.liceosorolla.Rectangulo;

public class RectanguloTest {
	private Rectangulo rectangulo;
	
	@Before
	public void Before() {
		rectangulo = new Rectangulo(6,9);
	}
	
	@Test
	public void comprobarLados() {
		boolean comprobar=false;
		assertEquals(comprobar,rectangulo.esCuadrado());
	}
	
	@Test
	public void comprobarPerimetro() {
		assertEquals(30,rectangulo.perimetro());
	}
	
	@Test
	public void comprobarArea() {
		assertEquals(54,rectangulo.area());
	}
	
	@Test
	public void comprobarHipotenusa() {
		assertEquals(10,rectangulo.hipotenusa());
	}
	
	@Test
	public void comprobarRadioCircunferencia() {
		assertEquals(3,rectangulo.radioCircunferencia());
	}
}
