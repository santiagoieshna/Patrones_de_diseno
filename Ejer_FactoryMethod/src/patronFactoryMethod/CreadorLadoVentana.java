package patronFactoryMethod;

public class CreadorLadoVentana extends CreadorLado {

	@Override
	public Lado factoryMethod() {
		
		return new Ventana();
	}

}
