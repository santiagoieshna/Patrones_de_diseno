package factory_santi.factory;

import factory_santi.product.Operacion;
import modelo.TarjetaPass;
import modelo.TipoPago;

public interface AbstractFactoryOperacion {
	public Operacion createOperacionEsporadico(OperacionCreator factoryOperacion , TipoPago tipoPago);
	public Operacion createOperacionHabitual(OperacionCreator factoryOperacion, TarjetaPass tarjeta);
	public Operacion createOperacionSocio(OperacionCreator factoryOperacion, String nombreYApellidos, float bonficacion,
			String codeApp);
}
