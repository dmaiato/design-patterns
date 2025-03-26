package trab2_observer;

public class Bidder implements Observer {
  private double latestBid;
  private String name;

  public Bidder(String name) {
    this.name = name;
  }

  @Override
  public void update(double latestBid) {
    this.latestBid = latestBid;
    System.out.println(name + " observed latest bid: " + latestBid);
  }

  public double getLatestBid() {
    return this.latestBid;
  }
}
