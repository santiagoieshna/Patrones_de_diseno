package factory_santi.product;

import java.time.LocalDate;

import modelo.Repostaje;
import modelo.RepostajeNoTerminadoException;
import modelo.TarjetaPass;
import modelo.TipoPago;

public class Operacion {
	private Repostaje repostaje;
	private LocalDate fecha;
	private String matricula;

	// cuando el repostaje lo hace un cliente no habitual
	private TipoPago tipoPago;
	// un cliente habitual solo puede pagar con tarjeta
	private TarjetaPass tarjeta;
	// Los asociados
	private String nombreYApellidos="";
	private float bonficacion = 0.1f;
	private String codeApp;

	public float getBonficacion() {
		return bonficacion;
	}
	
	//Hago un constructor vacio para hacer un factoryMethod de cada tipo en el enum de TipoCliente
	public Operacion() {
		super();
	}
	// Nota: No borro nada de esto parque que no de error el resto del los test y clases, esta clase seria abstracta
	// No tuve tiempo para tantos cambios 
	protected Operacion(Repostaje repostaje, LocalDate fecha, String matricula) throws RepostajeNoTerminadoException {
		super();
		if(!repostaje.isTerminado()) throw new RepostajeNoTerminadoException();
		this.repostaje = repostaje;
		this.fecha = fecha;
		this.matricula = matricula;
	}

	public Operacion(Repostaje repostaje, LocalDate fecha, String matricula, TipoPago tipoPagoEsporadico) throws RepostajeNoTerminadoException {
		this(repostaje,fecha,matricula);
		this.tipoPago = tipoPagoEsporadico;
	}

	public Operacion(Repostaje repostaje, LocalDate fecha, String matricula, TarjetaPass tarjeta) throws RepostajeNoTerminadoException {
		this(repostaje,fecha,matricula);
		this.tarjeta = tarjeta;
		this.tipoPago = TipoPago.tarjeta;
	}

	public Operacion(Repostaje repostaje, LocalDate fecha, String matricula, String nombreYApellidos, float bonficacion,
			String codeApp) throws RepostajeNoTerminadoException {
		this(repostaje,fecha,matricula);
		this.nombreYApellidos = nombreYApellidos;
		this.bonficacion = bonficacion;
		this.codeApp = codeApp;
		this.tipoPago = TipoPago.aplicacion;
	}

	public Repostaje getRepostaje() {
		return repostaje;
	}

	public void setRepostaje(Repostaje repostaje) {
		this.repostaje = repostaje;
	}

	private LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public boolean isAsociado() {
//		return nombreYApellidos.isEmpty();
		/*
		 * Si lo socios solo pagan con este tipo de pago, considero que es la 
		 * mejor forma de comporbarlo
		 */
		return this.tipoPago == TipoPago.aplicacion;
	}

	public boolean equalsNombre(String nombre) {
		return this.nombreYApellidos.equals(nombre);
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago=tipoPago;
		
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setTarjeta(TarjetaPass tarjeta) {
		this.tarjeta = tarjeta;
	}

	public void setNombreYApellidos(String nombreYApellidos) {
		this.nombreYApellidos = nombreYApellidos;
	}

	public void setBonficacion(float bonficacion) {
		this.bonficacion = bonficacion;
	}

	public void setCodeApp(String codeApp) {
		this.codeApp = codeApp;
	}

}
