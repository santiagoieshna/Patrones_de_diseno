package controller;

import java.util.Map;

import model.Habitacion;

public class TableroLaberinto {
	private Laberinto laberinto;

	public TableroLaberinto(Laberinto laberinto) {
		super();
		this.laberinto = laberinto;
	}
	
	public void printLaberintoNumeros() {
		Map<Coordenada,Habitacion> tablero =  laberinto.getMapaLaberinto();
//		System.out.println("Numero de habitaciones: "+ Habitacion.getNumeroDeHabitaciones());
		
		for (int i = getMinimoY()-1 ; i<= getMaximoY()+1; i++) {
			if(i>=0)
				System.out.print(" "+i+" |");
			else
				System.out.print(i+" |");
			for(int j= getMinimoX()-1 ; j<= getMaximoX()+1; j++ ) {
				
				Coordenada coordenada = new Coordenada(j,i);
				if(tablero.containsKey(coordenada)) {
					if(laberinto.getCoordenadFinal().equals(coordenada)) {
//						System.err.print(tablero.get(coordenada).getNumeroHabitacion());
//						System.err.print(1);
						System.out.print(2);
					}else if(laberinto.getCoordenadOrigen().equals(coordenada)){
//						System.err.print(0);
						System.out.print(0);
					}
					else {	
//						System.out.print(tablero.get(coordenada).getNumeroHabitacion());
						System.out.print(1);
					}
				}
				else {
					
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
			if(i==getMaximoY()+1) {
				System.out.print("    ");
				for (int j= getMinimoX()-1 ; j<= getMaximoX()+1; j++) {
					System.out.print(" _");
					
				}
				System.out.println();
				System.out.print("    ");
				for (int j= getMinimoX()-1 ; j<= getMaximoX()+1; j++) {
					if(j>=0)
						System.out.print(+j);
					else
						System.out.print(j);
					
				}
			}
		}
		
	}
	
	public void printAllCoordenadas() {
		laberinto.getMapaLaberinto().entrySet().stream().forEach(mapa->{
			System.out.println(mapa.getKey().toString());
		});
	}
	
	public void printRangoY() {
		System.out.println("Y: Max= "+getMaximoY()+" Min="+getMinimoY());
	}
	
	public void printRangoX() {
		System.out.println("X: Max= "+getMaximoX()+" Min="+getMinimoX());
	}
	
	private int getMaximoX() {
		return laberinto.getMapaLaberinto().entrySet().stream()
						.mapToInt(coordenada -> coordenada.getKey().getX())
						.max()
						.getAsInt();
	}
	private int getMinimoX() {
		return laberinto.getMapaLaberinto().entrySet().stream()
				.mapToInt(coordenada -> coordenada.getKey().getX())
				.min()
				.getAsInt();
	}
	private int getMaximoY() {
		return laberinto.getMapaLaberinto().entrySet().stream()
				.mapToInt(coordenada -> coordenada.getKey().getY())
				.max()
				.getAsInt();
	}
	
	private int getMinimoY() {
		return laberinto.getMapaLaberinto().entrySet().stream()
				.mapToInt(coordenada -> coordenada.getKey().getY())
				.min()
				.getAsInt();
	}
	

	
}
