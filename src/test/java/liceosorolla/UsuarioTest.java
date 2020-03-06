package test.java.liceosorolla;




	import static org.junit.Assert.assertEquals;

	import java.time.LocalDate;

	import org.junit.Before;
	import org.junit.Test;

	import main.java.liceosorolla.Usuario;

	public class UsuarioTest {
		private Usuario usuario;
		@Before
		public void Before() {
			usuario = new Usuario("Antonio","Ojeda Gonzalez", LocalDate.of(2000, 07, 05), 7);
		}
		@Test
		public void comprobarNombre() {
			assertEquals("Antonio", usuario.getNombre());
		}
		@Test
		public void comprobarApellidos() {
			assertEquals("Ojeda Gonzalez", usuario.getApellidos());
		}
		@Test
		public void comprobarNombreCompleto() {
			assertEquals("Antonio Ojeda Gonzalez", usuario.getNombre()+ " "+usuario.getApellidos());
		}
		@Test
		public void comprobarMayoriaDeEdad() {
			assertEquals(true,usuario.mayoriaEdad());
		}
		@Test
		public void comprobarIdentificador() {
			assertEquals(7,usuario.getident());
		}
		@Test
		public void comprobarNombreMayusculas() {
			assertEquals("ANTONIO",usuario.getNombre().toUpperCase());
		}
		@Test
		public void comprobarNombreMinusculas() {
			assertEquals("antonio",usuario.getNombre().toLowerCase());
		}
	}


