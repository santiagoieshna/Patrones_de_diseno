package pokemonRefactor;

import java.util.Objects;

public class Pokemon implements Icombate{
	private String nombre;
	private int nivel;
	private int ataque;
	private int ps;
	private int defensa;
	private float evasion;
	private float peso;
	private float altura;
	
	public Pokemon(String nombre, int nivel, int ataque, int ps, int defensa, float evasion, float peso, float altura) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.ataque = ataque;
		this.ps = ps;
		this.defensa = defensa;
		this.evasion = evasion;
		this.peso = peso;
		this.altura = altura;
	}

	
	public Pokemon() {
		
	}
	
	@Override
	public int atacar() {
		return getAtaque()+((int)0.2*getAtaque());
	}

	@Override
	public int recibirAtaque(int ataqueRival) {
		int damageRecibido = ataqueRival - getDefensa();
		setPs(getPs()-damageRecibido);
		return damageRecibido;
	}
	
	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getAtaque() {
		return ataque;
	}

	protected void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getPs() {
		return ps;
	}

	protected void setPs(int ps) {
		this.ps = ps;
	}

	public int getDefensa() {
		return defensa;
	}

	protected void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	protected float getEvasion() {
		return evasion;
	}

	protected void setEvasion(float evasion) {
		this.evasion = evasion;
	}

	public float getPeso() {
		return peso;
	}


	public float getAltura() {
		return altura;
	}


	protected void setPeso(float peso) {
		this.peso = peso;
	}


	protected void setAltura(float altura) {
		this.altura = altura;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ataque, defensa, evasion, nivel, nombre, ps);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return ataque == other.ataque && defensa == other.defensa
				&& Float.floatToIntBits(evasion) == Float.floatToIntBits(other.evasion) && nivel == other.nivel
				&& Objects.equals(nombre, other.nombre) && ps == other.ps;
	}

	
	
}
