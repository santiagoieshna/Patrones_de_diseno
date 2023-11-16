package pokemon;

public class Pokemon {
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
	

	
	
	public void descripcion() {
		System.out.println(this.toString());
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

	
	@Override
	public String toString() {
		return "Pokemon [nombre= " + nombre + ", tipo= " + tipo + ", nivel= " + nivel + ", numeroPokedex= " + numeroPokedex
				+ ","+ entrenador.toString() + "]";
	}




	
	
}
