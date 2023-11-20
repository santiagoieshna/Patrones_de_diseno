package ejercicio01problemaVersion2;


public class PelotaGorda {
	//una serie de propiedades que dependeran de la pelota concreto
	private int x = 0, y = 0;
	
	//todas las pelotas tienen estas propiedades
	private double peso=123456789;
	private String color="AzulOscuroCasiNegro";

	public PelotaGorda(int x, int y , double peso, String color) {
		super();
		this.x = x;
		this.y = y;	
	}
	public PelotaGorda() {
		super();
	}

}
