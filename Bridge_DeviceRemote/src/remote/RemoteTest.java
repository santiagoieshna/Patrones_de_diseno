package remote;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import device.TV;

class RemoteTest {

	@Test
	void testTooglePorwer() {
		Remote mando = new Remote(new TV());
		
		assertTrue(mando.tooglePorwer());
	}

	@Test
	void testVolumenUP() {
		
	}

	@Test
	void testVolumenDow() {
		
	}

}
