package trab2_observer;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer implements Subject {
  private List<Observer> observers = new ArrayList<>();
  private double latestBid;

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(latestBid));
  }

  public void acceptBid(Double newBid) {
    setLatestBid(newBid);
  }

  public void setLatestBid(double latestBid) {
    this.latestBid = latestBid;
    notifyObservers();
  }

}
