package santaTask.FactoryMethod;

import santaTask.Entities.*;

public class BicycleFactory extends ToyFactory {

	@Override
	public Toy createProduct(String toyName) {
		if(toyName == "MOUNTAIN_BICYCLE") {
			return new MountainBicycle();
		}
		
		if(toyName == "CITY_BICYCLE") {
			return new CityBicycle();
		}
		
		System.out.println("Unknown bicycle type");
		return null;
	}
}