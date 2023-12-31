package controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import model.Habitacion;
import model.Lado;
import model.Orientacion;

public class Laberinto {
	private HashMap<Coordenada, Habitacion> mapaLaberinto;

	private Coordenada coordenadaOrigen;
	private Coordenada coordenadaFinal;
	private Habitacion habitacion;

	/**
	 * Crear La habitacion Uno en la Coordenada (0, 0) y Orientacion.NORTE
	 */
	public Laberinto(int maxHabitaciones) {
		super();
		mapaLaberinto = new HashMap<>();
		this.coordenadaOrigen = new Coordenada(0, 0);
		this.habitacion = new Habitacion(Orientacion.NORTE);
		this.coordenadaFinal= this.habitacion.getPuertaSalida().getNuevaCoordenada(this.coordenadaOrigen);
		// Metemos habitacion uno
		mapaLaberinto.put(coordenadaOrigen, habitacion);
		comenzarLaberinto(maxHabitaciones);
	}

	/**
	 * Crear La habitacion Uno en la Coordenada (0, 0)
	 * 
	 * @param habitacion
	 * @param maxHabitaciones
	 */
	public Laberinto(Habitacion habitacion, int maxHabitaciones) {
		super();
		mapaLaberinto = new HashMap<>();
		this.coordenadaOrigen = new Coordenada(0, 0);
		this.habitacion = habitacion;
		this.coordenadaFinal= this.habitacion.getPuertaSalida().getNuevaCoordenada(this.coordenadaOrigen);
		// Metemos habitacion uno
		mapaLaberinto.put(coordenadaOrigen, habitacion);
		comenzarLaberinto(maxHabitaciones);
	}

	public Laberinto(Coordenada cordenadaOrigen, Habitacion habitacion, int maxHabitaciones) {
		super();
		mapaLaberinto = new HashMap<>();
		this.coordenadaOrigen = cordenadaOrigen;
		this.habitacion = habitacion;
		this.coordenadaFinal= this.habitacion.getPuertaSalida().getNuevaCoordenada(this.coordenadaOrigen);
		// Metemos habitacion uno
		mapaLaberinto.put(coordenadaOrigen, habitacion);
		comenzarLaberinto(maxHabitaciones);
	}
	
	public Laberinto(HashMap<Coordenada, Habitacion> mapaLaberinto) {
		super();
		this.mapaLaberinto = mapaLaberinto;
		this.coordenadaOrigen = new Coordenada(0, 0);
		this.habitacion = new Habitacion(Orientacion.NORTE);
		this.coordenadaFinal= this.habitacion.getPuertaSalida().getNuevaCoordenada(this.coordenadaOrigen);
		// Metemos habitacion uno
		mapaLaberinto.put(coordenadaOrigen, habitacion);
	}

	private void comenzarLaberinto(int maxHabitaciones) {
		int numeroDeHabitaciones = this.mapaLaberinto.size()+1;
		// Coger Orientacion puerta salida
		// Obtener Coordenada
		// Ver vecino
		// hay vecinos?
		// si hay -> prohibir que lado no puede ser puerta
		// Obetener lado contrario -> PuertaEntrada
		// Crear nueva habitacion
		// Meter en el mapa

		// La primer habitacion entra si o si
		Orientacion orientacionPuertaEntrada = this.mapaLaberinto.get(coordenadaOrigen).getPuertaSalida().getOrientacionRelativa();
		Coordenada coordenadaAnterior = coordenadaOrigen;
		Coordenada coordenadaNueva = this.mapaLaberinto.get(coordenadaOrigen).getPuertaSalida().getNuevaCoordenada(coordenadaAnterior);
//		Coordenada coordenadaNueva = habitacion.getPuertaSalida().getNuevaCoordenada(coordenadaAnterior);
		Habitacion habitacionNueva = new Habitacion(orientacionPuertaEntrada);
		Orientacion puertaSalida = habitacionNueva.getPuertaSalida();
		mapaLaberinto.put(coordenadaNueva, habitacionNueva);

		do {
			// Reseteamos valores
			coordenadaAnterior = coordenadaNueva;
			coordenadaNueva = puertaSalida.getNuevaCoordenada(coordenadaAnterior);
			orientacionPuertaEntrada = habitacionNueva.getPuertaSalida().getOrientacionRelativa();
			// Vemos donde esta la puertaSalida para obener la nueva coorddenada
			puertaSalida = habitacionNueva.getPuertaSalida();

			// Ver vecinos
			HashMap<Orientacion, Lado> ladosVecinos = comprobarVecinos(coordenadaNueva, orientacionPuertaEntrada);
			habitacionNueva = new Habitacion(orientacionPuertaEntrada, ladosVecinos);// AQUI FALLA
			mapaLaberinto.put(coordenadaNueva, habitacionNueva);

			setCoordenadaFinal(coordenadaNueva);
			numeroDeHabitaciones++;
		} while (numeroDeHabitaciones <= maxHabitaciones && habitacionNueva.haySalida());
	}
	
	/**
	 * Metodo para hacer test
	 * @param salidaHabitacionNueva
	 */
	private void addHabitacion(Orientacion salidaHabitacionNueva) {
		//Aqui no manda DEMETER vale?
		Orientacion orientacionPuertaEntrada = this.mapaLaberinto.get(coordenadaFinal).getPuertaSalida().getOrientacionRelativa();
		Coordenada coordenadaNueva = habitacion.getPuertaSalida().getNuevaCoordenada(coordenadaFinal);
		HashMap<Orientacion, Lado> ladosVecinos = comprobarVecinos(coordenadaNueva, orientacionPuertaEntrada);
		Habitacion habitacionNueva = new Habitacion(orientacionPuertaEntrada, ladosVecinos);
		Orientacion puertaSalida = habitacionNueva.getPuertaSalida();
		mapaLaberinto.put(coordenadaNueva, habitacionNueva);

		setCoordenadaFinal(coordenadaNueva);
	}

	private HashMap<Orientacion, Lado> comprobarVecinos(Coordenada coordenadaNueva, Orientacion puertaEntrada) {
		HashMap<Orientacion, Lado> ladosOcupados = new HashMap<>();
		List<Orientacion> orientacionesVecinas;
		// List<Coordenada> vecinos = coordenadaNueva.getContiguas();

		orientacionesVecinas = Arrays.asList(Orientacion.values()).stream()
				.filter(orientacion -> !orientacion.equals(puertaEntrada))
				.map(orientacion -> orientacion.getOrientacionRelativa()).collect(Collectors.toList());

		// No habia huevos a pasarlo a mapa por stream() !!!!
		for (Orientacion orientacionVecina : orientacionesVecinas) {
			Coordenada coordenadaVecina = orientacionVecina.getOrientacionRelativa()
					.getNuevaCoordenada(coordenadaNueva);
			if (mapaLaberinto.containsKey(coordenadaVecina)) {
				Lado lado = mapaLaberinto.get(coordenadaVecina).getLado(orientacionVecina);
				ladosOcupados.put(orientacionVecina.getOrientacionRelativa(), lado);
			}
		}

		if (ladosOcupados.size() == 0) {
			return null;
		}

		return ladosOcupados;
	}
	
	
	

	private void setCoordenadaFinal(Coordenada coordenadaFinal) {
		this.coordenadaFinal = coordenadaFinal;
	}

	public Coordenada getCoordenadFinal() {
		return this.coordenadaFinal;
	}

	public Coordenada getCoordenadOrigen() {
		return this.coordenadaOrigen;
	}

	public HashMap<Coordenada, Habitacion> getMapaLaberinto() {
		return mapaLaberinto;
	}
}
