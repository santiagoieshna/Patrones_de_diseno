package modelo.insectos;

public abstract class TipoHormiga {
	protected Hormiga hormiga;
	public TipoHormiga(Hormiga hormiga) {
		this.hormiga=hormiga;
	}
	public abstract void hacerTarea();
}
