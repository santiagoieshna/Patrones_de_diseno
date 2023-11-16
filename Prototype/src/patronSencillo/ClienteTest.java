package patronSencillo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	SubClassPrototype pokemon;
	
	SubClassPrototype prototipo;
	
	
	@BeforeEach
	public void initEach() throws CloneNotSupportedException {
		pokemon = new SubClassPrototype("Fantasma", "Gengar", 94 );
		prototipo = pokemon.clonar();
		
	}
	
	@Test
	void testClonacion() {
		
		pokemon.present();
		
		prototipo.present();
		
		boolean mismaReferencia = pokemon == prototipo;
		
		assertEquals(pokemon, prototipo);
		assertFalse(mismaReferencia);
		
	}
	
	@Test
	void testCambioEstado() {
		
		((SubClassPrototype)prototipo).setAtributoTres(32);
		
		prototipo.present();
		assertNotEquals(pokemon, prototipo);
	}

}
