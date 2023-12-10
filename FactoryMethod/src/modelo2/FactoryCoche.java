package modelo2;

import java.util.function.Supplier;

public enum FactoryCoche {

	TURISMO( ()->  new Turismo() ),
	DEPORTIVO( () -> {  return new Deportivo();	}),
	MONOVOLUMEN( () -> new Monovolumen() );
	
	
	private Supplier<ICoche> creatorCoche;

	private FactoryCoche(Supplier<ICoche> creatorCoche) {
		this.creatorCoche = creatorCoche;
	}
	
	public ICoche createCoche() {
		return creatorCoche.get();
	}
	
}
