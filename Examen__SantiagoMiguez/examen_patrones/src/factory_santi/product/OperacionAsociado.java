package factory_santi.product;

import java.time.LocalDate;

import modelo.Repostaje;
import modelo.RepostajeNoTerminadoException;
import modelo.TipoPago;

public class OperacionAsociado extends Operacion{
	private String nombreYApellidos="";
	private float bonficacion = 0.1f;
	private String codeApp;
//	private TipoPago tipoPago;
	
	public OperacionAsociado() {
		
	}
	
	public OperacionAsociado(Repostaje repostaje, LocalDate fecha, String matricula, String nombreYApellidos, float bonficacion,
			String codeApp) throws RepostajeNoTerminadoException {
		super(repostaje,fecha,matricula);
		this.nombreYApellidos = nombreYApellidos;
		this.bonficacion = bonficacion;
		this.codeApp = codeApp;
//		this.tipoPago = TipoPago.aplicacion;
	}
	public OperacionAsociado(Repostaje repostaje, LocalDate fecha, String matricula) throws RepostajeNoTerminadoException {
		super(repostaje,fecha,matricula);
		this.nombreYApellidos = nombreYApellidos;
		this.bonficacion = bonficacion;
		this.codeApp = codeApp;
//		this.tipoPago = TipoPago.aplicacion;
	}
}
