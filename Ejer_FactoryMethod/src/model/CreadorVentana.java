package model;

public class CreadorVentana extends Creador {

	@Override
	public Lado factoryMethod() {
		// TODO Auto-generated method stub
		return new Ventana();
	}

}
