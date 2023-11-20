package pizzeria;

public class Abstraccion {
	private Horneable horneable;

	public Abstraccion(Horneable horneable) {
		super();
		this.horneable = horneable;
	}
	
	public Pizza hacerPizza() {
		horneable.subirTemperatura();
		horneable.esperarTiempo();
		
		return horneable.hornear();
	}
	
}
