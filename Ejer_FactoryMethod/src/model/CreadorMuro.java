package model;

public class CreadorMuro extends Creador {

	@Override
	public Lado factoryMethod() {
		// TODO Auto-generated method stub
		return new Muro();
	}

}
