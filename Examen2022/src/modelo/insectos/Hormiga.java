package modelo.insectos;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.entidades.Hormiguero;
import modelo.oficio.HormigaGuerrera;
import modelo.oficio.HormigaRecolectora;
import modelo.oficio.Ioficio;
import modelo.soporte.Alimento;

public class Hormiga {

	PropertyChangeSupport ps = new PropertyChangeSupport(this);
	List<Alimento> alimentos; // Se pierde al ser guerrera
	
	List<Integer> luchas;
	
	private final int maxima=50;
	private int vida = new Random().nextInt(maxima)+1;
//	private int vida = 50;
	private int edad = 0;
	public long id;
	private static long idGlobal=0;
	protected int incrementoVidaPorDefecto = 1;
	// Esto se quita -> Se crea un State o Strategy
	private boolean estadoGuerra=false;
	private Ioficio oficio;

	public Hormiga(long id) {
		super();
		this.id = id;
		alimentos = new ArrayList();
		luchas=new ArrayList<>();
		// Toda Hormiga nace siendo recolectora
		this.oficio = new HormigaRecolectora(this);
	}
	
	public Hormiga() {
		super();
		this.id = idGlobal;
		incrmentarIdGlobal();
		alimentos = new ArrayList();
		luchas=new ArrayList<>();
		// Toda Hormiga nace siendo recolectora
		this.oficio = new HormigaRecolectora(this);
	}
	
	private static void incrmentarIdGlobal() {
		idGlobal ++;
	}

	public void setOficio(Ioficio oficio) {
		this.oficio = oficio;
	}

	public boolean isEstadoGuerra() {
		return estadoGuerra;
	}

	public void setEstadoGuerra(boolean guerrera) {
		this.estadoGuerra = guerrera;
	}

	public List<Alimento> getAlimentos() {
		return alimentos;
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
//			System.out.println("tareo "+this.edad );
			this.oficio.hacerTarea();
		}else {
			ps.firePropertyChange("Muerte", null, this);
//			System.out.println(id+" mori por mi hormiguero");
		}
	};

	public boolean isAlive() {
		return vida > edad;
	}

	public void incrementaEdad(int i) {
		this.edad += i;
	}

	public List<Integer>  getLuchas() {
		return luchas;
	}

	
	public void addLuchaRandom(int nextInt) {
		getLuchas().add(nextInt);
		
	}

	public void addAlimento(Alimento randomAlimento) {
		this.getAlimentos().add(Alimento.getRandomAlimento());
	}

	public void incrementaEdadPorDefecto() {
		incrementaEdad(incrementoVidaPorDefecto);
	}

	public void estamosGuerreando() {
		oficio.estadoHormiguero(isEstadoGuerra());
	}
	
	public void addListener(Hormiguero hormiguero) {
		this.ps.addPropertyChangeListener(hormiguero);
	}

	public boolean isGuerrera() {
		
		return this.oficio instanceof HormigaGuerrera;
	}

	public boolean isRecolectora() {
		
		return this.oficio instanceof HormigaRecolectora;
	}

}
