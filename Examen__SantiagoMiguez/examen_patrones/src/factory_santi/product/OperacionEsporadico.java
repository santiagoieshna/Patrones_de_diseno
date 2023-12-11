package factory_santi.product;

import java.time.LocalDate;

import modelo.Repostaje;
import modelo.RepostajeNoTerminadoException;
import modelo.TipoPago;

public class OperacionEsporadico extends Operacion{

//	private TipoPago tipoPago;
	
	public OperacionEsporadico() {
		//para hacer un factoryMethod de cada tipo en el enum de TipoCliente
	}
	
	public OperacionEsporadico(Repostaje repostaje, LocalDate fecha, String matricula) throws RepostajeNoTerminadoException {
		super(repostaje,fecha,matricula);
//		this.tipoPago = tipoPagoEsporadico;
	}
}
