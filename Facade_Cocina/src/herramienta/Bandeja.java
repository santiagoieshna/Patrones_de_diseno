package herramienta;


import java.util.List;

import comida.Comida;

public class Bandeja {
	private List<Comida> comida;

	public List<Comida> getComida() {
		return comida;
	}

	public void setComida(List<Comida> comida) {
		this.comida = comida;
	}
	
	public boolean addComida(Comida comida) {
		return this.comida.add(comida);
	}
	
}
