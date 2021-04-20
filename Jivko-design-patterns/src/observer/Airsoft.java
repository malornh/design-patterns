package observer;

import java.util.ArrayList;
import java.util.List;

public class Airsoft implements Observable {

	private List<Observer> observers;
	private String airsoft;
	
	public Airsoft() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setAirsoft(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.airsoft;
	}
	
	public void setAirsoft(String newairsoft) {
		this.airsoft = newairsoft;
		this.notifyObservers();
	}
	

}
