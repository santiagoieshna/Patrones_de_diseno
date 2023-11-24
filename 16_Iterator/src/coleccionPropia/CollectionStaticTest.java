package coleccionPropia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CollectionStaticTest {

	CollectionStatic colecion ;
	
	@BeforeEach
	void initTest() {
		int value = 7;
		colecion = new CollectionStatic(value);
		colecion.add(3);
		colecion.add(2);
		colecion.add(1);
		colecion.add(6);
		colecion.add(2);
		colecion.add(5);
		colecion.add(7);
	}
	
	@Test
	void testSize() {
		int value = 3;
		CollectionStatic colecionDiferente = new CollectionStatic(value);
		
		colecionDiferente.add(2);
		colecionDiferente.add(3);
		
		assertFalse(colecionDiferente.size()==value);
		
		colecionDiferente.add(1);
		colecionDiferente.add(6);
		colecionDiferente.add(5);
		colecionDiferente.add(7);
		assertTrue(colecionDiferente.size()==value);
		
		
	}
	@Test
	void superandoMaximo() {
		int value = 3;
		CollectionStatic colecionNueva = new CollectionStatic(value);
	
		colecionNueva.add(1);
		assertTrue(colecionNueva.add(2));
		assertTrue(colecionNueva.add(3));
		assertFalse(colecionNueva.add(6));
		assertFalse(colecionNueva.add(5));
		assertFalse(colecionNueva.add(7));
	}
	
	@Test
	void devolverIndice() {
		int valorBuscado=2;
		int indiceEsperado = 1;
		
		assertEquals(indiceEsperado,colecion.indexOf(valorBuscado));
		
	}
	
	@Test
	void devolverIndiceNoExistente() {
		int valorBuscado=34;
		int indiceEsperado = -1;
		
		assertEquals(indiceEsperado,colecion.indexOf(valorBuscado));
		
	}
	
	@Test
	void obtenerValor() {
		int indiceBuscado=1;
		int valorEsperado = 2;
		assertEquals(valorEsperado, colecion.get(indiceBuscado));
	}
	
	@Test
	void obtenerValorNo() {
		int indiceBuscado=9;
		int valorEsperado = -1;
		assertEquals(valorEsperado, colecion.get(indiceBuscado));
	}
	@Test
	void borrarValor() {
		int indiceBorrado=3;
		int valorEsperado = 6;
		assertEquals(valorEsperado, colecion.remove(indiceBorrado));
		
		//Comprobar que se desplaza
		valorEsperado = 2;
		assertEquals(valorEsperado, colecion.get(indiceBorrado));
	}
	
	
	

}
