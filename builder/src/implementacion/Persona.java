package implementacion;

public class Persona {
	// Obligatorio
	private String nombre;
	// opcional
	private String nombrePrimogenito;
	private String nombreSegundoGenito;

	private Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	private void setNombrePrimogenito(String nombrePrimogenito) {
		this.nombrePrimogenito = nombrePrimogenito;
	}
	

	private void setNombreSegundoGenito(String nombreSegundoGenito) {
		this.nombreSegundoGenito = nombreSegundoGenito;
	}


	public static class Builder {
		private String nombre;
		// opcional
		private String nombrePrimogenito="";
		private String nombreSegundoGenito="";

		public Builder nombrePrimogenito(String nombre){
			this.nombrePrimogenito=nombre;
			return this;	
		}
		public Builder nombreSegundoGenito(String nombre){
			this.nombreSegundoGenito=nombre;
			return this;	
		}

		public Persona build() {
			Persona persona = new Persona(this.nombre);
			persona.setNombrePrimogenito(nombrePrimogenito);
			persona.setNombreSegundoGenito(nombreSegundoGenito);
			return persona;
		}

		public Builder(String nombre) {
			super();
			this.nombre = nombre;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getNombrePrimogenito() {
		return nombrePrimogenito;
	}
	
}
