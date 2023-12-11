package factory_santi.product;

import java.time.LocalDate;

import modelo.Repostaje;
import modelo.RepostajeNoTerminadoException;
import modelo.TarjetaPass;
import modelo.TipoPago;

public class OperacionTarjeta extends Operacion{
	private TarjetaPass tarjeta;
//	private TipoPago tipoPago;
	
	public OperacionTarjeta() {
		
	}
	
	public OperacionTarjeta(Repostaje repostaje, LocalDate fecha, String matricula, TarjetaPass tarjeta) throws RepostajeNoTerminadoException {
		super(repostaje,fecha,matricula);
		this.tarjeta = tarjeta;
//		this.tipoPago = TipoPago.tarjeta;
	}
	
	
}
