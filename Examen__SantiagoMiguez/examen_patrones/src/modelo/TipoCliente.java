package modelo;

import java.util.function.Supplier;

import factory_santi.factory.AbstractFactoryOperacion;
import factory_santi.product.Operacion;
import factory_santi.product.OperacionAsociado;
import factory_santi.product.OperacionEsporadico;
import factory_santi.product.OperacionTarjeta;

public enum TipoCliente {
	esporadico(()-> new OperacionEsporadico()),
	habitual(()-> new OperacionEsporadico()),
	asociado(()-> new OperacionTarjeta());
	
	private Supplier<Operacion> factoyOperacion;
	
	private TipoCliente(Supplier<Operacion> factoyOperacion) {
		this.factoyOperacion = factoyOperacion;
	}

	public Operacion factoryMethod() {
		
		return factoyOperacion.get();
	}
}
