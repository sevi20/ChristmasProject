package santaTask.FactoryMethod;

import santaTask.Entities.Toy;

public abstract class ToyFactory {

	public abstract Toy createProduct(String toyName);
	
	public Toy produceToy(String toyName) {
		Toy toy = createProduct(toyName);
		toy.getName();
		return toy;
	}
}