package trab2_observer;

public class Main {
  public static void main(String[] args) {
    Auctioneer auctioneer = new Auctioneer();
    Bidder bidder1 = new Bidder("Marquinhos");
    Bidder bidder2 = new Bidder("Jeremias");
    Bidder bidder3 = new Bidder("Godofredo");

    auctioneer.registerObserver(bidder1);
    auctioneer.registerObserver(bidder2);
    auctioneer.registerObserver(bidder3);

    auctioneer.acceptBid(27.50);
  }
}
