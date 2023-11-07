package ejercicio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void test() {
		Persona personita = new Persona.Builder("Santi", "Miguez")
										.nombrePrimogenito("ricardo")
										.edad(29)
										.result();
	}

}
