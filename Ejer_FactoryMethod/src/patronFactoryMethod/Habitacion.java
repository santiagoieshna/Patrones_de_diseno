package patronFactoryMethod;

public class Habitacion {
	// REGLAS : Habra 
	CreadorLado ladoNorte;
	
	public Habitacion() {
		super();
		ladoNorte = new CreadorLadoPuerta();
	}
	
	
	
	
}
