package model;

import java.util.function.Function;

import controller.Coordenada;

public enum Orientacion {
	NORTE("SUR", (coordenada)-> {return new Coordenada(coordenada.getX(),coordenada.getY()-1);}),
	SUR("NORTE", (coordenada)-> {return new Coordenada(coordenada.getX(),coordenada.getY()+1);}),
	ESTE("OESTE", (coordenada)-> {return new Coordenada(coordenada.getX()+1,coordenada.getY());}),
	OESTE("ESTE", (coordenada)-> {return new Coordenada(coordenada.getX()-1,coordenada.getY());});
	
	private String orientacionContraria;
	private Function<Coordenada,Coordenada> coordenadaNueva; // EL NO ve

	private Orientacion(String orientacionContraria,Function<Coordenada,Coordenada> coordenadaNueva) {
		this.orientacionContraria = orientacionContraria;
		this.coordenadaNueva = coordenadaNueva; 
	}
	
	public String getOrientacionContraria() {
		return orientacionContraria;
	}
	
	public Coordenada getNuevaCoordenada(Coordenada coordenada) {
		return coordenadaNueva.apply(coordenada);
	}
	
	public Orientacion getOrientacionRelativa() {
		return Orientacion.valueOf(this.getOrientacionContraria());
	}
	
}
