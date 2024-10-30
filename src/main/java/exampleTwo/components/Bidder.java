package exampleTwo.components;

import exampleTwo.mediator.AuctionMediator;

public class Bidder implements Colleague {

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bitAmount) {
        auctionMediator.placeBid(this, bitAmount);
    }

    @Override
    public void receiveBidNotification(int bitAmount) {
        System.out.println("Bidder " + name + " got the notification that someone has put bid of :" + bitAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
