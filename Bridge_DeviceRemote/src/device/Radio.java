package device;

public class Radio implements Device {

	boolean encendido;
	String frecuencia;
	
	
	@Override
	public boolean isEnabel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVolumen(int porcentaje) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getChanel() {
		return null;
	}

	@Override
	public void setChanel(String chanel) {
		// TODO Auto-generated method stub

	}

}
