package device;

public class TV implements Device {
	String canal;
	int volumen;
	boolean encendido;
	final int VOLUMEN_MAXIMO = 150;

	public TV() {
		super();
		this.canal = "2";
		this.volumen = 50;
		this.encendido = false;
	}

	@Override
	public boolean isEnabel() {
		return encendido;
	}

	@Override
	public void enable() {
		this.encendido = true;

	}

	@Override
	public void disable() {
		this.encendido = false;
	}

	@Override
	public int getVolumen() {
		return this.volumen;
	}

	@Override
	public void setVolumen(int porcentaje) {
		
		if (porcentaje > VOLUMEN_MAXIMO) {
			this.volumen = VOLUMEN_MAXIMO;
		} else if (porcentaje <= 0) {
			this.volumen = 0;
		} else {
			this.volumen = porcentaje;
		}

	}

	@Override
	public String getChanel() {
		return canal;
	}

	@Override
	public void setChanel(String chanel) {
		this.canal = chanel;

	}

}
