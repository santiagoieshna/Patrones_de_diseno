package patron;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Cliente {

	@Test
	void test() {
		Publisher ropitaShein = new Publisher(false);
		ConcreteSubscribers	subscriptor = new ConcreteSubscribers("Elena");
		ropitaShein.subscribe(subscriptor);
		
		ropitaShein.mainBusinerssLogic(false, "Cambio de descripcion");
		
		ropitaShein.mainBusinerssLogic(true, "Nuevo stcok");
		
	}

}
