package teoria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneralTest {

	@Test
	void test() {
		ConcreteBuilderPersona builder = new ConcreteBuilderPersona();
		Director director=new Director(builder);
		director.construct();
		Persona persona = builder.getPersona();
	}

}
