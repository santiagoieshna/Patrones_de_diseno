package comida;

public class Animal extends Comida{
	String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		
		return this.nombre;
	}
}
