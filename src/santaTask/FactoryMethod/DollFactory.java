package santaTask.FactoryMethod;

import santaTask.Entities.*;

public class DollFactory extends ToyFactory {

	@Override
	public Toy createProduct(String toyName) {
		if(toyName == "WOODEN_DOLL") {
			return new WoodenDoll();
		}
		
		if(toyName == "PLASTIC_DOLL") {
			return new PlasticDoll();
		}
		
		System.out.println("Unknown doll type");
		return null;
	}
}
