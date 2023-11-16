package pokemonSolucion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	Entrenador santi;
	Pokemon gengar;
	Pokemon clon;
	
	@BeforeEach
	void intiTest() throws CloneNotSupportedException {
		santi = new Entrenador("Santi",3);
		gengar = new Pokemon("Gengar", Tipo.Fantasma, 60, 94, santi);
		
		clon = gengar.clonar();
	}
	
	@Test
	void testMismoEstado() {
		
//		gengar.descripcion();
//		((Pokemon)clon).descripcion();
		
		assertEquals(gengar, clon);
	}
	
	@Test
	void testDistintaReferencia() {
		assertFalse(gengar==clon);
		
	}
	
	@Test
	void testEntrenadorDistintaReferencia(){
		boolean mismoEntrenadorReferencia = clon.getEntrenador() == gengar.getEntrenador();
		gengar.descripcion();
		clon.descripcion();
		assertFalse(mismoEntrenadorReferencia);
	}
	
	@Test
	void testCambioEstado() {
		
		
	}
	@Test
	void testCambioEntrenador() {
		Entrenador joselito = new Entrenador("Joselito", 2);
		clon.setEntrenador(joselito);
		
		boolean mismoEntrenador = clon.getEntrenador() == gengar.getEntrenador();
//		gengar.descripcion();
//		clon.descripcion();
		
		assertFalse(mismoEntrenador);
	}
	

}
