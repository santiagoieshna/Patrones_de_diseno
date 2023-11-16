package patron;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Client {

	@Test
	void test() {
		String saludo= "Hola hola hola";
		Service servicio = new Service();
		//Descomentar para ver que no se podria
//		servicio.serviceMethod(saludo);
		
		ClientInterface peticionCliente = new Adapter(servicio);
		peticionCliente.method(saludo);
		
	}

}
