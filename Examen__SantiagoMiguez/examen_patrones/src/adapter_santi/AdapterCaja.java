package adapter_santi;

import java.util.Optional;

import factory_santi.product.Operacion;
import modelo.Caja;
import modelo.Par;
import modelo.Repostaje;
import modelo.TipoPago;

public class AdapterCaja implements IPagoGasolinera {
	private Caja caja;
	
	public AdapterCaja(Caja caja) {
		super();
		this.caja = caja;
	}

	@Override
	public void procesarPago(Operacion operacion) {
		long idRepostaje = convertToFormatCajaIdRepostaje(operacion);// Naming feo? pensar despues
		float cantidad = convertToFormatCajaCantidadRepostaje(operacion);
		TipoPago tipopago = convertToFormatCajaTipoPago(operacion);
		
		this.caja.procesarPago(idRepostaje, cantidad, tipopago);
	}

	@Override
	public Optional<Par<TipoPago, Float>> getPagoByIdRepostaje(Repostaje repostaje) {
		long idRepostaje = convertToFormatCajaIdRepostaje(repostaje);
		return caja.getPagoByIdRepostaje(idRepostaje);
	}

	private TipoPago convertToFormatCajaTipoPago(Operacion operacion) {
		return operacion.getTipoPago();
	}
	
	private long convertToFormatCajaIdRepostaje(Operacion operacion) {
		return operacion.getRepostaje().getId();
	}

	private long convertToFormatCajaIdRepostaje(Repostaje repostaje) {
		return repostaje.getId();
	}

	private float convertToFormatCajaCantidadRepostaje(Operacion operacion) {
		return operacion.getRepostaje().getImporteReal();
	}
	

}
