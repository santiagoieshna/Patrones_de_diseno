package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.AbstractFactoryWar;
import factory.FactoryWarAsirio;
import factory.FactoryWarPersa;
import products.GuerreroAPie;
import products.asirios.TipoAsirio;
import products.persas.TipoPersa;

class FactoryWarAsirioTest {

	@Test
	void testCreateGuerreroAPie() {
		TipoAsirio tipoUno = TipoAsirio.LUSSAGA;
		TipoPersa tipoDos = TipoPersa.SORBATU;
		
		AbstractFactoryWar<TipoPersa> fAsirio = new FactoryWarPersa();

		GuerreroAPie guerreroAndador = fAsirio.createGuerreroAPie(tipoDos);
		
		
	
		
		
	}

}
