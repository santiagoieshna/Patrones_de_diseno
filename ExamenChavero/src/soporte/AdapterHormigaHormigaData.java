package modelo.soporte;

import modelo.insectos.Hormiga;

public class AdapterHormigaHormigaData {
	public static HormigaData conversor(Hormiga hormiga) {
		return new HormigaData(hormiga.getAlimentos(), hormiga.getVida(), hormiga.getId());
	}
}
