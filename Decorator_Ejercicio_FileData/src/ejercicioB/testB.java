package ejercicioB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicioB.CompressionDecorator;
import ejercicioB.DataSource;
import ejercicioB.DataSourceDecorator;
import ejercicioB.EncryptionDecorator;
import ejercicioB.FileDataSource;

class testB {

	@Test
	void test() {
DataSource archivo = new FileDataSource();
		
		DataSourceDecorator compresor = new CompressionDecorator(archivo);
		DataSourceDecorator encriptador = new EncryptionDecorator(compresor);
		
		encriptador.writeData("Palabra");
		System.out.println("--------------------------------------------");
		System.out.println(encriptador.readData());
		
	}

}
