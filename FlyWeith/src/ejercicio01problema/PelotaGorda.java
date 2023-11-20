package ejercicio01problema;


public class PelotaGorda {
	//una serie de propiedades que dependeran de la pelota concreto
	private int x = 0, y = 0;
	
	//todas las pelotas tienen estas propiedades
//	private double peso=123456789;
//	private String color="AzulOscuroCasiNegro";
	private PelotaGordaType flyWeight;

	public PelotaGorda(int x, int y , double peso,String color) {
		super();
		PelotaGordaFactory factory = PelotaGordaFactory.getInstance();
		this.x = x;
		this.y = y;	
		this.flyWeight=factory.getFlyWeight(peso,color);
	}
	
	public PelotaGorda() {
		super();
	}
	
	public void botar() {
		this.flyWeight.botar(this.x, this.y);
	}

}
