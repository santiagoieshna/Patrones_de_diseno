package facade;

import funcionesComplicadas.ClaseComplicadaA;
import funcionesComplicadas.ClaseComplicadaB;
import funcionesComplicadas.ClaseComplicadaC;

public class Facade {
	private ClaseComplicadaA claseA;
	private ClaseComplicadaB claseB;
	private ClaseComplicadaC claseC;
	
	public Facade(ClaseComplicadaA claseA, ClaseComplicadaB claseB, ClaseComplicadaC claseC) {
		super();
		this.claseA = claseA;
		this.claseB = claseB;
		this.claseC = claseC;
	}

	public Facade() {
		super();
	}
	
	public void doSomething1() {
		
	}
	
	public void doSomething2(int number) {
		
	}
	
}
