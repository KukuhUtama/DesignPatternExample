package org.personal.design.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Dress implements Observable {

	private List<Observer> observers;
	private int stock;

	public Dress() {
		observers = new ArrayList<Observer>();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObserver() {
		if (getStock() < 1) {
			for (Observer observer : observers) {
				observer.update();
			}
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
		notifyObserver();
	}

}