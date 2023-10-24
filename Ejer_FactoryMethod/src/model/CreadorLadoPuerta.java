package model;

public class CreadorLadoPuerta extends CreadorLado {

	@Override
	public Lado factoryMethod() {
		
		return new Puerta();
	}

}
