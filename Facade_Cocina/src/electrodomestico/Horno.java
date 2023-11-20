package electrodomestico;

import java.util.List;

import comida.Comida;
import herramienta.Bandeja;

public class Horno {
	private boolean encendido;
	private int temporizador;
	private float temperatura;
	private Bandeja bandeja;
	
	public Horno() {
		super();
		this.encendido=false;
		this.temporizador=0;
		this.temperatura=0;
		this.bandeja = new Bandeja();
	}
	public void encender() {
		encendido = true;
	}
	public void apagar() {
		encendido = false;
	}
	public boolean isEncendido() {
		return this.encendido;
	}
	public void setTemporizador(int temporizador) {
		if(isEncendido())
		this.temporizador = temporizador;
	}
	public void setTemperatura(float temperatura) {
		if(isEncendido())
		this.temperatura = temperatura;
	}
	
	public void ponerComida(Comida comida) {
		this.bandeja.addComida(comida);
	}
	
	public List<Comida> sacarComida(){
		return this.bandeja.getComida();
	}
	

}
