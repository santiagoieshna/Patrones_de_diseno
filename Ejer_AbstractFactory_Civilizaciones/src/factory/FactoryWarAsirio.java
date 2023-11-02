package factory;

import products.GuerreroACaballo;
import products.GuerreroAPie;
import products.GuerreroArieteDeGuerra;
import products.GuerreroArmaADistancia;
import products.GuerreroVehiculoDeLucha;
import products.asirios.GuerreroAPieAsirio;
import products.asirios.TipoAsirio;

public class FactoryWarAsirio implements AbstractFactoryWar<TipoAsirio> {

	@Override
	public GuerreroAPie createGuerreroAPie(TipoAsirio t) {
		
		return new GuerreroAPieAsirio(t);
	}

	@Override
	public GuerreroACaballo createGuerreroACaballo(TipoAsirio t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GuerreroArmaADistancia createGuerreroArmaAistancia(TipoAsirio t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GuerreroArieteDeGuerra createGuerreroArieteDeGuerra(TipoAsirio t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GuerreroVehiculoDeLucha createGuerreroVehiculoeLucha(TipoAsirio t) {
		// TODO Auto-generated method stub
		return null;
	}

}
