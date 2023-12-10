package modelo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Cliente {

	@Test
	void test() {

		FactoryCoche factory = FactoryCoche.MONOVOLUMEN;
		
		ICoche coche = factory.createCoche();
		
		assertTrue(coche instanceof Monovolumen);
		
		
	}

}
