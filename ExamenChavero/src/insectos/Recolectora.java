package modelo.insectos;

import modelo.soporte.Alimento;

public class Recolectora extends TipoHormiga{
	
	
	public Recolectora(Hormiga hormiga) {
		super(hormiga);
	}
	
	@Override
	public void hacerTarea() {
		hormiga.incrementaEdad(hormiga.incrementoVidaPorDefecto);
		hormiga.alimentos.add(Alimento.getRandomAlimento());
	}

}
