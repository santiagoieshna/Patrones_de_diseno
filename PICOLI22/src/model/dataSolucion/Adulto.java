package model.dataSolucion;

public class Adulto implements StateMadurez {
	private long ahorro;
	private boolean activo;
	private Ser ser;
	
	public void setContext(Ser context) {
		this.ser= context;
	}
	
	
	public Adulto(Ser ser) {
		// TODO Auto-generated constructor stub
	}

	// Esto solo los adultos
	// nv 100
	// ahorros 10
	// sueldo 80
	@Override
	public void alimentar(int cantidad) {
		int total = 0;
		if (this.ser.getEdad() < this.ser.edadAnciano) {
			// sueldo es la cantidad
			int resto = cantidad - this.ser.getNecesidadVital();
			// resto sera -20
			this.ahorro += resto;
			// ahorros -10
			if (ahorro < 0) {
				total = (int) (this.ser.getNecesidadVital()  - ahorro);
				this.ahorro = 0;
			}
		} else {
			total = cantidad;
		}
		this.ser.recalcularEsperanzaDeVida(total);
	}

	@Override
	public boolean crecer(int cantidad) {
		// Si crece muere
		return false;
	}

}
