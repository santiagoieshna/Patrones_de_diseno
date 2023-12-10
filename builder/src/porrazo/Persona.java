package porrazo;

public class Persona {
	//especificacion obligatios
	protected int id;
	protected String nombre;
	protected String appellidos;
	//especificacion opciomal
	protected String phone;
	protected String color;
	
	static Id builder() {
		return new BuilderUser();
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAppellidos() {
		return appellidos;
	}

	public String getPhone() {
		return phone;
	}

	public String getColor() {
		return color;
	}
	
}
