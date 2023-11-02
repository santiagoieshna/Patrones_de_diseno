package factory;

import products.GuerreroACaballo;
import products.GuerreroAPie;
import products.GuerreroArieteDeGuerra;
import products.GuerreroArmaADistancia;
import products.GuerreroVehiculoDeLucha;

public interface AbstractFactoryWar<T> {
	
	GuerreroAPie createGuerreroAPie(T t);
	GuerreroACaballo createGuerreroACaballo(T t);
	GuerreroArmaADistancia createGuerreroArmaAistancia(T t);
	GuerreroArieteDeGuerra createGuerreroArieteDeGuerra(T t);
	GuerreroVehiculoDeLucha createGuerreroVehiculoeLucha(T t);
}
