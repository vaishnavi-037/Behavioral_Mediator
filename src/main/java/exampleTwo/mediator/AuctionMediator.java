package exampleTwo.mediator;

import exampleTwo.components.Colleague;

public interface AuctionMediator {

    void addBidder(Colleague bidder);

    void placeBid(Colleague bidder, int bidAmount);
}
