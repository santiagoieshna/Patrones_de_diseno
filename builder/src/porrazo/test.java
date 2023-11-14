package porrazo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		Persona build = Persona.builder()
				.id(12)
				.nombre("hola")
				.apellidos("Zambrano^2").build();
		
	}

}
