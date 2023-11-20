package herramienta;

import comida.Comida;

public class Espatula {
	private Comida comida;

	public Espatula() {
		super();
		this.comida=null;
	}
	
	public boolean cogerComida(Comida comida) {
		this.comida = comida;
		return true;
	}
	
	public Comida soltarComida() {
		Comida holder = this.comida;
		setComida(null);
		return holder;
	}
	
	private Comida getComida() {
		return this.comida;
	}
	
	private void setComida(Comida comida) {
		this.comida= comida;
	}
	
	
}
