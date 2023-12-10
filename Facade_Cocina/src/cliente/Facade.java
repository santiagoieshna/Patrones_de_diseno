package cliente;

import comida.Animal;
import comida.TrozosAnimal;
import comida.TrozosVegetal;
import comida.Vegetal;
import electrodomestico.Horno;
import herramienta.Bandeja;
import herramienta.Cuchillo;

public class Facade {
	
	public void hacerPolloAlHorno() {
		//Pollo al horno con cebolla
		Animal pollo = new Animal("Pollo");
		Cuchillo cuchilloCocina = new Cuchillo();
		TrozosAnimal polloEnTrozos = cuchilloCocina.trocearAnimal(pollo);
		Vegetal cebolla = new Vegetal("Cebolla");
		TrozosVegetal cebollaTroceada = cuchilloCocina.trocearVegetal(cebolla);
		Horno horno = new Horno();
		horno.encender();
		horno.ponerComida(cebollaTroceada);
		horno.ponerComida(polloEnTrozos);
		horno.setTemperatura(125.5f);
		horno.setTemporizador(50);
			// tras esperar 50 min...
		Bandeja plato = new Bandeja();
		plato.setComida(horno.sacarComida());
	}
	
	
	
}
