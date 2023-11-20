package patron;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Client {

	@Test
	void test() {
		Invoker boton = new Invoker();
		Command comando = new Command1();
		
		boton.setCommand(comando);
		boton.executeCommand();
		
		
		
	}

}
