package ejercicio01;

public class Persona {
	// Obligatorio
	private String nombre;
	private String apellido;
	private int edad;
	
	// opcional
	private String nombrePrimogenito;
	private String nombreSegundoGenito;

	private Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido=apellido;
	}

	
	//INNER CLASS
	public static class Builder{
		
		private Persona persona;
		
		public Builder(String nombre, String apellido) {
			persona = new Persona(nombre, apellido);
			
		}
		
		public Builder edad(int edad) {
			persona.setEdad(edad);
			return this;
		}
		
		public Builder nombrePrimogenito(String primogenito) {
			persona.setNombrePrimogenito(primogenito);
			return this;
		}
		
		public Builder nombreSegundoGenito(String nombreSegundoGenito) {
			persona.setNombreSegundoGenito(nombreSegundoGenito);
			return this;
		}
		
		public Persona result() {
			return this.persona;
		}
		
	}
	
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}


	private void setNombrePrimogenito(String nombrePrimogenito) {
		this.nombrePrimogenito = nombrePrimogenito;
	}
	

	private void setNombreSegundoGenito(String nombreSegundoGenito) {
		this.nombreSegundoGenito = nombreSegundoGenito;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNombrePrimogenito() {
		return nombrePrimogenito;
	}
	
}
