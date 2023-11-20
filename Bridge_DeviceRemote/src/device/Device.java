package device;

public interface Device {
    boolean	isEnabel();
	void enable();
	void disable();
	int getVolumen();
	void setVolumen(int porcentaje);
	String getChanel();
	void setChanel(String chanel);
	
}
