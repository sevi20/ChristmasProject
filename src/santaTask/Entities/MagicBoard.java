package santaTask.Entities;

import java.util.ArrayList;
import java.util.List;

import santaTask.Observer.Observable;
import santaTask.Observer.Observer;

public class MagicBoard implements Observable {
	private List<Observer> observers;
	private String toyName;
	
	public MagicBoard(){
        this.observers = new ArrayList<>();
    }

    public void getDoll(String dollType) {
        System.out.println(dollType + " typed on magic board!");
        this.toyName = dollType;
        this.notifyObservers();
    }

    public void getBicycle(String bicycleType) {
        System.out.println(bicycleType + " typed on magic board!");
        this.toyName = bicycleType;
        this.notifyObservers();
    }

	@Override
	public void subscribe(Observer observer) {
		 this.observers.add(observer);
	     observer.setMagicBoard(this);;
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
        observer.setMagicBoard(null);
	}

	@Override
	public void notifyObservers() {
		 for (Observer observer:this.observers) {
			 observer.update();
	     }
	}

	@Override
	public String getToyName() {
		return this.toyName;
	}
}
