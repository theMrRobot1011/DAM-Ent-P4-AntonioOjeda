package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorolla.Animal;

public class AnimalTest {
	
	private Animal animal;
	@Before
	public void Before() {
		animal = new Animal("Anfivio","Dardo",20,30,"verde",20.40,10);
	}
	
	@Test
	public void comprobarEspecie() {
		assertEquals("Anfivio", animal.getEspecie());
	}
	
	@Test
	public void comprobarRaza() {
		assertEquals("Dardo", animal.getRaza());
	}
	
	@Test
	public void comprobarPeso() {
		assertEquals(20, animal.getPeso());
	}
	
	@Test
	public void comprobarEdad() {
		assertEquals(30, animal.getEdad());
	}
	
	@Test
	public void comprobarColorDePelo() {
		assertEquals("verde", animal.getColorDePelo());
	}
}
