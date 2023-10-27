package App;

import controller.Laberinto;
import controller.TableroLaberinto;
import model.Habitacion;
import model.Orientacion;

public class App {
	public static void main(String[] args) {
		int numeroHabitaciones = 360;
		boolean respuesta = false;

		while (!respuesta) {
			try {

				Laberinto laberinto = new Laberinto(numeroHabitaciones);
				TableroLaberinto tablero = new TableroLaberinto(laberinto);
				System.out.println("N Habitaciones: " + Habitacion.getNumeroDeHabitaciones());
				tablero.printRangoX();
				tablero.printRangoY();
				tablero.printAllCoordenadas();
				System.err.println("----------------------");
				tablero.printLaberintoNumeros();
				respuesta = true;
			} catch (Exception e) {
				System.err.println("NO");
				respuesta = false;
			}
		}
	}
}
