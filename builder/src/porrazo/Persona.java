package porrazo;

public class Persona {
	//especificacion obligatios
	int id;
	String nombre;
	String appellidos;
	//especificacion opciomal
	String phone;
	String color;
	
	static Id builder() {
		return new BuilderUser();
	}
	
}
