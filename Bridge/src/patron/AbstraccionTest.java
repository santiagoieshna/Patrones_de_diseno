package patron;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbstraccionTest {

	@Test
	void test() {
		Abstraccion abstraccion = new Abstraccion(new ConcreteImplementations());
		abstraccion.feature1();
		abstraccion.feature2();
		
		
		
	}

}
