package ejercicio04.factory;

import ejercicio04.product.Bike;
import ejercicio04.product.Car;
import ejercicio04.product.Location;

public class FactoryUSA extends FactoryAbstractLocation {

	@Override
	public Car createCar(FactoryCar factoryCar) {
		return factoryCar.factoryMethod(Location.USA);
	}

	@Override
	public Bike createBike(FactoryBike factoryBike) {
		return factoryBike.getBike(Location.USA);
	}

}
