package suplemento;

import cafe.Cafe;
import extra.Extra;

public class Canela implements Extra {
	Cafe cafe;
	private final int precio = 30;
	
	public Canela(Cafe cafe) {
		super();
		this.cafe = cafe;
	}
	@Override
	public String descripcion() {
		return null;
	}

	@Override
	public int precio() {
		return cafe.precio()+ this.precio;
	}

	@Override
	public void extra() {
		
	}

	@Override
	public Cafe desmantelar() {
		return null;
	}

	

}
