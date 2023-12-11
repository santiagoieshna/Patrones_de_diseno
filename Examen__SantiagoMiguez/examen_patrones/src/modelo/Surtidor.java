package modelo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
/*Lineas importantes para el OBSERVER:
 * 
 * linea 17 -> implementacion para ser el Observer 
 * linea 25 -> conectamos el surtidos a sus depositor para observarlos
 * linea 37 -> el metodo donde le hemos quitado la implementacion antigua
 * linea 71 -> metodo de la interface implementado para saber cuando un deposito esta vacio
 * linea 78 -> quitamos el deposito de la lista
 */
public class Surtidor implements PropertyChangeListener{
	private int numero;
	private List<Deposito> depositos;

	public Surtidor(int numero, List<Deposito> depositos) {
		super();
		this.numero = numero;
		this.depositos = depositos;
		addListener();
	}

	private void addListener() {
		depositos.forEach(d->d.subscribe(this));
		
	}

	public List<Deposito> getDepositos() {
		return this.depositos;
	}

	public boolean isCombustibleDisponible(Combustible combustible) {
//		List<Deposito> collect = depositos.stream()
//				.filter((deposito)->{return deposito.isEmpty();})
//				.collect(Collectors.toList());
//		depositos.removeAll(collect);
		return depositos.stream()
				.anyMatch((deposito)->{return deposito.isCombustible(combustible);});
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	private void setDepositos(List<Deposito> depositos) {
		this.depositos = depositos;
	}

	public float cerrarRepostaje(float importe,Combustible combustible) {
		Optional<Deposito> findFirst = depositos.stream()
			.filter((deposito)->{return deposito.isCombustible(combustible);})
			.findFirst();
		float reducirCantidadActual = findFirst
			.get().reducirCantidadActual(importe);
		if(findFirst.isEmpty()) {
			depositos.remove(findFirst);
		}
		return reducirCantidadActual;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// Cuando el deposito se acabe, aqui habra que eliminar de la lista dicho deposito
		Deposito depositoVacio = (Deposito) evt.getNewValue();
		quitarDeposito(depositoVacio);
//		System.out.println("Deposito quitado (Cantiada actual:"+ depositoVacio.getCantidadActual()+")");
	}

	private void quitarDeposito(Deposito depositoVacio) {
		this.depositos.remove(depositoVacio);
	}

}
