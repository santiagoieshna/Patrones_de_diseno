package modelo.oficio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.insectos.Hormiga;

public class HormigaGuerrera extends Ioficio {
	
	
	public HormigaGuerrera(Hormiga hormiga) {
		super(hormiga);
		
	}

	@Override
	public void hacerTarea() {
//		System.out.println(hormiga.id+" Peleo");
		this.hormiga.incrementaEdad(this.hormiga.getVida()/4);
		int tiempoMaximoLucha=100;
		this.hormiga.addLuchaRandom(new Random().nextInt(tiempoMaximoLucha));
	}

	@Override
	public void estadoHormiguero(boolean estamosGuerreando) {
		if(!estamosGuerreando)
			this.hormiga.setOficio(new HormigaRecolectora(hormiga));	
	}
	
	
}
