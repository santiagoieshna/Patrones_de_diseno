package banco02.client;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import banco02.ConcreteFactoryYoung;

class ClientTest {

	@Test
	void test() {
		Client young=new Client(new ConcreteFactoryYoung());
		System.out.println(young.account.comission);
	}

}
