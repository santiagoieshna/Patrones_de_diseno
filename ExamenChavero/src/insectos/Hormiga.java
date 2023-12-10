package modelo.insectos;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;
import java.util.function.Function;

import factoryTipoHormiga.FactoryTipoHormiga;
import modelo.entidades.Hormiguero;
import modelo.soporte.Alimento;

public class Hormiga{

	PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	List<Alimento> alimentos;
	List<Integer> luchas;
	private final int maxima=50;
	private int vida = new Random().nextInt(maxima)+1;
	private int edad = 0;
	public long id;
	protected int incrementoVidaPorDefecto = 1;
	private TipoHormiga tipohormiga;

	public Hormiga(long id) {
		super();
		this.id = id;
		alimentos = new ArrayList<>();
		luchas=new ArrayList<>();
		
	}
	public List<Alimento> getAlimentos() {
		return alimentos;
	}
	
	public void addListener(Hormiguero hormiguero) {
		pcs.addPropertyChangeListener(hormiguero);
	}

	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void hacerTarea() {
		if(this.isAlive()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tipohormiga.hacerTarea();
//			if (guerrera) {
//				incrementaEdad(vida/4);
//				int tiempoMaximoLucha=100;
//				luchas.add(new Random().nextInt(tiempoMaximoLucha));
//			}else{
//				incrementaEdad(incrementoVidaPorDefecto);
//				alimentos.add(Alimento.getRandomAlimento());
//			}
		}else{
//			System.out.println(id+" mori por mi hormiguero");
		}
	};

	public boolean isAlive() {
		boolean isAlive = vida>edad;
		if(!isAlive) pcs.firePropertyChange("Dead", null, this);
		return isAlive;
	}
	
	public void setTipo(Function<Hormiga, TipoHormiga> factoryMethod) {
		this.tipohormiga=factoryMethod.apply(this);
	}

	protected void incrementaEdad(int i) {
		this.edad += i;
	}

	public List<Integer> getLuchas() {
		return luchas;
	}

	public void addLuchas(Integer luchas) {
		this.luchas.add(luchas);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIncrementoVidaPorDefecto() {
		return incrementoVidaPorDefecto;
	}

	public void setIncrementoVidaPorDefecto(int incrementoVidaPorDefecto) {
		this.incrementoVidaPorDefecto = incrementoVidaPorDefecto;
	}

	public int getMaxima() {
		return maxima;
	}
	
	public boolean isGuerrera() {
		return tipohormiga instanceof Guerrera;
	}

	
	

}
