package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/*
 * OBSERVER lineas importantes
 * 
 * linea 23 -> PropertyChangeSupport paara ser el observable
 * linea 25 -> metodo para añadir el surtidor como listener
 * linea 29 ->  metodo para eliminar listener, (no requerido en el examen)
 * linea 33 -> metodo para notificar a los surtidores (listener) conectados a este deposito
 * linea 79 -> zona donde se modifica la cantidad y verificamos si esta vacio para llamar al metodo notifySurtidores()
 */
public class Deposito {
	
	
	private Combustible combustible;
	private float capacidad;
	private float cantidadActual;
	
	// OBSERVER ------
	private PropertyChangeSupport pcs  =new PropertyChangeSupport(this);
	
	public void subscribe(PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(listener);
	}
	
	public void unsubscribe(PropertyChangeListener listener) {
		pcs.removePropertyChangeListener(listener);
	}
	
	private void notifySurtidores() {
		pcs.firePropertyChange("Deposito vacio",null , this);
	}
	
	
	public Deposito(Combustible combustible, float capacidad, float cantidadActual) {
		super();
		this.combustible = combustible;
		this.capacidad = capacidad;
		this.cantidadActual = cantidadActual;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public boolean isCombustible(Combustible combustible) {
		return this.combustible==combustible;
	}
	public float getCapacidad() {
		return capacidad;
	}

	private void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}

	public float getCantidadActual() {
		return cantidadActual;
	}

	private void setCantidadActual(float cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	private void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	//si el deposito solo puede suplir parte del importe esa es la cifra que nos entregara
	//pondra el deposito a cero
	public float reducirCantidadActual(float importeReal) {
//		System.out.println("combustible "+combustible);
//		System.out.println("antes de reducir "+cantidadActual);
		cantidadActual-=combustible.getLitrosPorPrecio(importeReal);
//		System.out.println("la cantidad actual "+cantidadActual);
		if(isEmpty()) notifySurtidores();//En este punto saltamos el trigger de que esta vacio
		return importeReal-comprobarExceso();
	}

	private float comprobarExceso() {
		float faltante=0;
		if(cantidadActual<0) {
			faltante=Math.abs(cantidadActual);
			cantidadActual=0;
		}
		return faltante*combustible.getTarifaPorLitro();
	}

	public boolean isEmpty() {
		return cantidadActual<=0;
	}

	@Override
	public String toString() {
		return "tipo "+combustible;
	}
}