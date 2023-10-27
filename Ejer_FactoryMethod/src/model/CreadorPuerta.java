package model;

public class CreadorPuerta extends Creador {

	@Override
	public Lado factoryMethod() {
		
		return new Puerta();
	}

}
