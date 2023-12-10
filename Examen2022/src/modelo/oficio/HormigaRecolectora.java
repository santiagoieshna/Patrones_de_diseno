package modelo.oficio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.insectos.Hormiga;
import modelo.soporte.Alimento;

public class HormigaRecolectora extends Ioficio {
	
	public HormigaRecolectora(Hormiga hormiga) {
		super(hormiga);
		resetearListAlimentos(); // no sabemos cuando 
	}

	@Override
	public void hacerTarea() {
//		System.out.println(hormiga.id+" Recolecto");
		this.hormiga.incrementaEdadPorDefecto();
		this.hormiga.addAlimento(Alimento.getRandomAlimento()); // Demeter demeter
	}
	
	public void resetearListAlimentos() {
		this.hormiga.setAlimentos(new ArrayList<>());
	}

	@Override
	public void estadoHormiguero(boolean estamosGuerreando) {
		if(estamosGuerreando)
			this.hormiga.setOficio(new HormigaGuerrera(this.hormiga));
	}


}
