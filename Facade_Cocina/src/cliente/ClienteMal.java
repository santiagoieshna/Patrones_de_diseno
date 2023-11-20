package cliente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import comida.Animal;
import comida.Comida;
import comida.TrozosAnimal;
import comida.TrozosVegetal;
import comida.Vegetal;
import electrodomestico.Horno;
import herramienta.Bandeja;
import herramienta.Cuchillo;

class ClienteMal {

	@Test
	void test() {
		
		//Pollo al horno con cebolla
		Animal pollo = new Animal("Pollo");
		Cuchillo cuchilloCocina = new Cuchillo();
		TrozosAnimal polloEnTrozos = cuchilloCocina.trocearAnimal(pollo);
		cuchilloCocina.limpiar();
		Vegetal cebolla = new Vegetal("Cebolla");
		TrozosVegetal cebollaTroceada = cuchilloCocina.trocearVegetal(cebolla);
		cuchilloCocina.limpiar();
		Horno horno = new Horno();
		horno.encender();
		horno.ponerComida(cebollaTroceada);
		horno.ponerComida(pollo);
		horno.setTemperatura(125.5f);
		horno.setTemporizador(50);
			// tras esperar 50 min...
		Bandeja plato = new Bandeja();
		plato.setComida(horno.sacarComida());
		
		
	}
	@Test
	void prepararComida() {
		
		//Pollo al horno con cebolla
		Comida animal = new Comida();
		Cuchillo cuchilloCocina = new Cuchillo();
		Comida animalEnTrozos = cuchilloCocina.trocearComida(animal);		
		cuchilloCocina.limpiar();
		Horno horno = new Horno();
		horno.encender();
		horno.ponerComida(animal);
		horno.setTemperatura(125.5f);
		horno.setTemporizador(50);
		// tras esperar 50 min...
		Bandeja plato = new Bandeja();
		plato.setComida(horno.sacarComida());
		
		
	}

}
