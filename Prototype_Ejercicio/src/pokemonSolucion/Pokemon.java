package pokemonSolucion;

import java.util.Objects;

public class Pokemon implements Prototype{
	private String nombre;
	private Tipo tipo;
	private int nivel;
	private int numeroPokedex;
	private Entrenador entrenador;
	
	public Pokemon(String nombre, Tipo tipo, int nivel, int numeroPokedex, Entrenador entrenador) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.nivel = nivel;
		this.numeroPokedex = numeroPokedex;
		this.entrenador = entrenador;
	}
	
	@Override
	public Pokemon clonar() throws CloneNotSupportedException {
		Pokemon clon = (Pokemon) super.clone();
		Entrenador entrenadorClon = this.getEntrenador().clonar();
		clon.setEntrenador(entrenadorClon);
		return clon;
	}
	
	public void descripcion() {
		System.out.println(this.toString());
	}
	

	
	@Override
	public String toString() {
		return "Pokemon [nombre= " + nombre + ", tipo= " + tipo + ", nivel= " + nivel + ", numeroPokedex= " + numeroPokedex
				+ ","+ entrenador.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(entrenador, nivel, nombre, numeroPokedex, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(entrenador, other.entrenador) && nivel == other.nivel
				&& Objects.equals(nombre, other.nombre) && numeroPokedex == other.numeroPokedex && tipo == other.tipo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getNumeroPokedex() {
		return numeroPokedex;
	}

	public void setNumeroPokedex(int numeroPokedex) {
		this.numeroPokedex = numeroPokedex;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
	
}
