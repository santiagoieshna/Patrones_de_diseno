package patronTeorico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	SubClassPrototype pokemon;
	
	Prototype prototipo;
	
	
	@BeforeEach
	public void initEach() {
		pokemon = new SubClassPrototype("Fantasma", "Gengar", 94 );
		
		prototipo = pokemon.clonar();
	}
	
	@Test
	void testClonacion() {
		
		pokemon.present();
		
		prototipo.present();
		
		boolean mismaReferencia = pokemon == prototipo;
		
		// Ver si son iguales
		assertEquals(pokemon, prototipo);
		// Ver si es el mismo (misma referencia de memoria)
		assertFalse(mismaReferencia);
		
	}
	
	@Test
	void testCambioEstado() {
		
		((SubClassPrototype)prototipo).setAtributoTres(32);
		
//		prototipo.present();
		assertNotEquals(pokemon, prototipo);
	}

}
