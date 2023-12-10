package ejercicio04.factory;

import ejercicio04.product.Car;
import ejercicio04.product.Location;
import ejercicio04.product.SedanCar;
import ejercicio04.product.SmallCar;

public class FactorySmallCar extends FactoryCar {

	@Override
	public Car factoryMethod(Location location) {
		return new SmallCar(location);
	}

}
