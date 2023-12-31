package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Habitacion {

	private HashMap<Orientacion, Lado> lados;
	private Orientacion puertaEntrada;
	private Orientacion puertaSalida;
	private int numeroHabitacion;
	
	static final int maximoLados = 4;
	private static int habitacionesTotales = 0;

	public Habitacion(Orientacion puertaEntrada) {
		super();
		lados = new HashMap<>();
		this.puertaEntrada = puertaEntrada;

		setLado(puertaEntrada, new CreadorPuerta().factoryMethod());

		this.puertaSalida = genOrientacionRandom();

		setLado(puertaSalida, new CreadorPuerta().factoryMethod());

		setLado(genOrientacionRandom(), genLadoRandon());
		setLado(genOrientacionRandom(), genLadoRandon());
		this.numeroHabitacion= habitacionesTotales;
		habitacionesTotales++;
	}

	public Habitacion(Orientacion puertaEntrada, HashMap<Orientacion, Lado> ladosOcupados) {

		super();
		lados = new HashMap<>();
			
		this.puertaEntrada = puertaEntrada;
		setLado(puertaEntrada, new CreadorPuerta().factoryMethod());
		if(ladosOcupados != null) {
			ladosOcupados.entrySet().stream().forEach(entrada ->{
				setLado(entrada.getKey(), entrada.getValue());
			});
		}

		if (getLados().size() == maximoLados) {// Estaria todo ocupado
			puertaSalida = null;
		} else if (getLados().size() == maximoLados - 1) {// Solo queda un lado libre
			Arrays.asList(Orientacion.values()).forEach(orientacion -> {
				if (!getLados().containsKey(orientacion))
					setLado(orientacion, new CreadorPuerta().factoryMethod());
			});
			;
		} else {
			this.puertaSalida = genOrientacionRandom();
			setLado(puertaSalida, new CreadorPuerta().factoryMethod());
			while(this.getLados().size()<maximoLados) {
				setLado(genOrientacionRandom(), genLadoRandon());
			}
		}

		this.numeroHabitacion= habitacionesTotales;
		habitacionesTotales++;
	}

	private Lado genLadoRandon() {
		Lado lado = (new Random().nextInt(2) == 0) ? new CreadorVentana().factoryMethod()
				: new CreadorMuro().factoryMethod();
		return lado;
	}

	private Orientacion genOrientacionRandom() {
		Orientacion orientacionCandidata;
		do {
			orientacionCandidata = Orientacion.values()[new Random().nextInt(4)];

		} while (getLados().containsKey(orientacionCandidata));

		return orientacionCandidata;
	}

	private void setLado(Orientacion orientacion, Lado factoryMethod) {
		getLados().put(orientacion, factoryMethod);
	}
	
	public Boolean haySalida() {
//		return !this.getPuertaSalida().equals(null);
		return !(this.getPuertaSalida()==(null));
	}

	public Orientacion getPuertaEntrada() {
		return puertaEntrada;
	}

	public Orientacion getPuertaSalida() {
		return puertaSalida;
	}

	public Map<Orientacion, Lado> getLados() {
		return lados;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public Lado getLado(Orientacion orientacion) {
		return lados.get(orientacion);	
	}
	public static int getNumeroDeHabitaciones() {
		return habitacionesTotales;
	}

}
