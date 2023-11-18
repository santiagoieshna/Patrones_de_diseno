package impresoraSolucion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void test() {

		ImpresoraSiemens impresoraVieja = new ImpresoraSiemens("57M2");
		Iimpresora colorCliente = new AdapterImpresoraSiemens(impresoraVieja);
		
		String rosaPaloHex = "#FFE3E8"; // RGB : { 255, 227, 232}
		
		boolean respuesta = colorCliente.establecerColor(rosaPaloHex);
		
		assertTrue(respuesta);
		
		int[] rosaPaloRgb = { 255, 227, 232};
		
//		System.out.println(Arrays.toString(impresoraVieja.getRgb()));
		
		assertArrayEquals( rosaPaloRgb, impresoraVieja.getRgb());
		
	}

}
