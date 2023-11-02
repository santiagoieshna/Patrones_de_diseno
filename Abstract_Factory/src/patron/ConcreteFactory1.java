package patron;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductoA createProductoA() {
//		AbstractProductoA productoA1 = new ProductoA1();

		return new ProductoA1();
	}

	@Override
	public AbstractProductoB createProductoB() {
//		AbstractProductoB productoB1 = new ProductoB1();

		return new ProductoB1();
	}

}
