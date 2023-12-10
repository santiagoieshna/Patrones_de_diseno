package ejercicio04.factory;

import ejercicio04.product.Car;
import ejercicio04.product.Location;
import ejercicio04.product.SedanCar;

public class FactorySedanCar extends FactoryCar {

	@Override
	public Car factoryMethod(Location location) {
		return new SedanCar(location);
	}

}
