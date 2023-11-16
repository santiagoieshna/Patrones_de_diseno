package pokemonSolucion;

import java.util.Objects;

public class Entrenador implements Prototype{
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
	
	@Override
	public Entrenador clonar() {
		
		try {
			return  (Entrenador) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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

	@Override
	public int hashCode() {
		return Objects.hash(medallas, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrenador other = (Entrenador) obj;
		return medallas == other.medallas && Objects.equals(nombre, other.nombre);
	}

	
	
	
	
}
