package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.AbstractFactoryWar;
import factory.FactoryWarAsirio;
import products.asirios.TipoAsirio;

class FactoryWarAsirioTest {

	@Test
	void testCreateGuerreroAPie() {
		TipoAsirio tipoUno = TipoAsirio.LUSSAGA;
		AbstractFactoryWar<TipoAsirio> fAsirio = new FactoryWarAsirio();
		

	}

}
