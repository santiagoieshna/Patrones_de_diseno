package ejercicioA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testA {

	@Test
	void test() {
		
		DataSource archivo = new FileDataSource();
		
		DataSourceDecorator compresor = new CompressionDecorator(archivo);
		DataSourceDecorator encriptador = new EncryptionDecorator(compresor);
		
		encriptador.writeData("Palabra");
		System.out.println("----------------------");
		encriptador.readData();
		
	}

}
