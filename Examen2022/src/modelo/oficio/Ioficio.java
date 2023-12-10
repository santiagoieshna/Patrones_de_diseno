package modelo.oficio;

import modelo.insectos.Hormiga;

public abstract class  Ioficio {
	protected Hormiga hormiga;
	
	public Ioficio(Hormiga hormiga) {
		super();
		this.hormiga = hormiga;
	}

	public abstract void hacerTarea();
	public abstract void estadoHormiguero(boolean estamosGuerreando);
}
