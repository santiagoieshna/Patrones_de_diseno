package patronTeorico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteEstudianteTest {
	
	Estudiante elena;
	Estudiante clon ;
	
	@BeforeEach
	public void initTest() {
		 elena = new Estudiante("Elena", 22);
		 clon = elena.clonar();
	}
	
	@Test
	void testMismoEstado() {
		elena.present();
		assertEquals(elena, clon);
	}
	
	@Test
	void testMismaReferencia() {
		boolean referencia = clon == elena;
		assertFalse(referencia);
	}
	
	@Test
	void testCambioEstado() {
		clon.setNombre("Adelaida");
		assertNotEquals(elena, clon);
		assertNotEquals(elena.getNombre(), clon.getNombre());
	}
	

}
