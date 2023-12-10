package modelo.insectos;

import java.util.Random;

public class Guerrera extends TipoHormiga{

	public Guerrera(Hormiga hormiga) {
		super(hormiga);
	}

	@Override
	public void hacerTarea() {
		hormiga.incrementaEdad(hormiga.getVida()/4);
		int tiempoMaximoLucha=100;
		hormiga.addLuchas((new Random().nextInt(tiempoMaximoLucha)));
		
	}
	
}
