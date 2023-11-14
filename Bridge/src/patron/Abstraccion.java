package patron;

public class Abstraccion {
	private Implementation implementacion;

	public Abstraccion(Implementation implementacion) {
		super();
		this.implementacion = implementacion;
	}
	
	public void feature1() {
		this.implementacion.method1();
	}
	
	public void feature2() {
		this.implementacion.method2();
		this.implementacion.method3();
	}
	
}
