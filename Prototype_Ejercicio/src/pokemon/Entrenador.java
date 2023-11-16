package pokemon;

public class Entrenador {
	private String nombre;
	private int medallas;
	
	public Entrenador() {
		super();
	}
	
	public Entrenador(String nombre) {
		super();
		this.nombre = nombre;
		this.medallas=0;
	}
	
	public Entrenador(String nombre, int medallas) {
		super();
		this.nombre = nombre;
		this.medallas=medallas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMedallas() {
		return medallas;
	}

	public void setMedallas(int medallas) {
		this.medallas = medallas;
	}

	@Override
	public String toString() {
		return "Entrenador [nombre= " + nombre + ", medallas= " + medallas + "]";
	}
	
	
}
