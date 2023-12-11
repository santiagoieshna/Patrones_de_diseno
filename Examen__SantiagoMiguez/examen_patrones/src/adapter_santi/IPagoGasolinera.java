package adapter_santi;

import java.util.Optional;

import factory_santi.product.Operacion;
import modelo.Par;
import modelo.Repostaje;
import modelo.TipoPago;

public interface IPagoGasolinera {
	public void procesarPago(Operacion operacion);
	// Que getPagoByIdRepostaje sea por estampado, no veo mal que se pudiera por el id tal cual
	public Optional<Par<TipoPago, Float>> getPagoByIdRepostaje(Repostaje repostaje);
}
