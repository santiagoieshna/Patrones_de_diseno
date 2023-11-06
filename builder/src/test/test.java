package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import implementacion.Persona;

class test {

	@Test
	void test() {
		Persona build = new Persona.Builder("Ataulfo").build();
		assertEquals("", build.getNombrePrimogenito());
		String nombre = "Bernardo";
		build = new Persona.Builder("Clodomiro").nombrePrimogenito(nombre).build();
		assertEquals(nombre, build.getNombrePrimogenito());
		build = new Persona.Builder("Germano").nombreSegundoGenito("Sonia").build();
	}

}
