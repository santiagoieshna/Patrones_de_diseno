package factory;

import products.GuerreroACaballo;
import products.GuerreroAPie;
import products.GuerreroArieteDeGuerra;
import products.GuerreroArmaADistancia;
import products.GuerreroVehiculoDeLucha;
import products.asirios.GuerreroAPieAsirio;
import products.persas.GuerreroAPiePersa;
import products.persas.TipoPersa;

public class FactoryWarPersa implements AbstractFactoryWar<TipoPersa> {

	@Override
	public GuerreroAPie createGuerreroAPie(TipoPersa t) {
		
		return new GuerreroAPiePersa(t);
	}

	@Override
	public GuerreroACaballo createGuerreroACaballo(TipoPersa t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GuerreroArmaADistancia createGuerreroArmaAistancia(TipoPersa t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GuerreroArieteDeGuerra createGuerreroArieteDeGuerra(TipoPersa t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GuerreroVehiculoDeLucha createGuerreroVehiculoeLucha(TipoPersa t) {
		// TODO Auto-generated method stub
		return null;
	}

}
