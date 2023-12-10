package Modelo1;

public abstract class Creator {
	Product producto; // Linea continua del UML
	
	public abstract Product fectoryMethod();
	
	public Product getProducto() {
		return producto;
	}
	
}
