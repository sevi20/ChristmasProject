package santaTask.Entities;

import santaTask.FactoryMethod.*;
import santaTask.Observer.Observable;
import santaTask.Observer.Observer;

public class Gnome implements Observer {
	
	private Observable magicBoard;
    private String name;
    private DollFactory dollFactory;
    private BicycleFactory bicycleFactory;

    public Gnome(String name, DollFactory dollFactory, BicycleFactory bicycleFactory) {
        this.name = name;
        this.dollFactory = dollFactory;
        this.bicycleFactory = bicycleFactory;
    }

	@Override
	public void update() {
		
        if (this.magicBoard == null) {
            System.out.println("No magicboard set");
            return;
        }
        
        String toyName = this.magicBoard.getToyName();
    
        Toy toy;
        
        if (toyName.contains("DOLL")) {
        	toy = dollFactory.createProduct(toyName);
        	System.out.println(this.name + " is getting " + toy.getName());
        } else if (toyName.contains("BICYCLE")) {
        	toy = bicycleFactory.createProduct(toyName);
        	System.out.println(this.name + " is getting " + toy.getName());
        }
	}

	@Override
	public void setMagicBoard(Observable magicBoard) {
		this.magicBoard = magicBoard;
	}
}