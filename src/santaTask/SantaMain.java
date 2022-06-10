package santaTask;

import santaTask.Command.*;
import santaTask.Entities.*;
import santaTask.FactoryMethod.*;

public class SantaMain {

	public static void main(String[] args) {
	
		DollFactory dollFactory = new DollFactory();		
		BicycleFactory bicycleFactory = new BicycleFactory();
		
		Santa santa = Santa.getInstance();
        MagicBoard magicBoard = new MagicBoard();
        Gnome gnome1 = new Gnome("Gnome 1", dollFactory, bicycleFactory);
        magicBoard.subscribe(gnome1);
        Gnome gnome2 = new Gnome("Gnome 2", dollFactory, bicycleFactory);
        magicBoard.subscribe(gnome2);
        
        Command getDollCommand = new GetDollCommand(magicBoard);
        Command getBicycleCommand = new GetBicycleCommand(magicBoard);
        
        santa.setCommand(getDollCommand);
        santa.postMessage("WOODEN_DOLL");

        santa.setCommand(getBicycleCommand);
        santa.postMessage("CITY_BICYCLE");		
	}
}
