package org.personal.design.observerpattern;

public interface Observable {
   public void addObserver(Observer observer);
   public void notifyObserver();
}
