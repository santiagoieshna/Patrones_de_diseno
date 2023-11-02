package patron;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public AbstractProductoA createProductoA() {
		return new ProductoA2();
	}

	@Override
	public AbstractProductoB createProductoB() {
		// TODO Auto-generated method stub
		return new ProductoB2();
	}


}
