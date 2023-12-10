package cafe;

public class CafeLargo implements Cafe {
	private int precio;
	
	public CafeLargo(int precio) {
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

