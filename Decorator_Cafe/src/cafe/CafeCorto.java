package cafe;

public class CafeCorto implements Cafe {
	private int precio;
	
	public CafeCorto(int precio) {
		this.precio=precio;
	}

	@Override
	public String descripcion() {
		return "Cafe corto";
	}

	@Override
	public int precio() {
		
		return this.precio;
	}

}
