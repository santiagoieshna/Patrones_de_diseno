package patronTeorico;

import java.util.Objects;

public class Estudiante implements Prototype{
	private String nombre;
	private int edad;
	
	public Estudiante(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Estudiante() {
		super();
	}
	
	public Estudiante(Estudiante prototipo) {
		this.edad = prototipo.edad;
		this.nombre= prototipo.nombre;
	}

	@Override
	public Estudiante clonar() {
//		Estudiante clon = new Estudiante();
//		clon.nombre = this.getNombre();
//		clon.edad = this.getEdad();
		return new Estudiante(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void holaMePresento() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public void present() {
		System.out.println(this.toString());
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	
}
