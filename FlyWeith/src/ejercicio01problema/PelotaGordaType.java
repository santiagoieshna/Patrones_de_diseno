package ejercicio01problema;

import java.util.Objects;

public class PelotaGordaType {
	final private double peso;
	final private String color;
	
	public PelotaGordaType(double peso, String color) {
		super();
		this.peso = peso;
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}
	
	public void botar(int x, int y) {
		System.out.println("BolaGorda: "+color+" - "+peso);
		System.out.println(this);
		System.out.println("Boto en {"+x+","+y+"}");
		System.out.println("-----------------------");
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PelotaGordaType other = (PelotaGordaType) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}

//	@Override
//	public String toString() {
//		return "PelotaGordaType Color=" + color + ", Peso=" + peso + "]";
//	}
	
	
	
}
