package herramienta;

import comida.Animal;
import comida.Comida;
import comida.TrozosAnimal;
import comida.TrozosVegetal;
import comida.Vegetal;

public class Cuchillo {

	public TrozosAnimal trocearAnimal(Animal pollo) {
		return new TrozosAnimal(pollo.getNombre());
	}
	public TrozosVegetal trocearVegetal(Vegetal vegetal) {
		return new TrozosVegetal(vegetal.getNombre());
	}
	public Comida trocearComida(Comida comida) {
		return comida;
	}
	
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}

}
