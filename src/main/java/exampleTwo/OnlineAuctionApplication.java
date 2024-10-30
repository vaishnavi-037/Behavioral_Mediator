package exampleTwo;

import exampleTwo.components.Bidder;
import exampleTwo.components.Colleague;
import exampleTwo.mediator.Auction;
import exampleTwo.mediator.AuctionMediator;

public class OnlineAuctionApplication {
    public static void main(String[] args) {
        AuctionMediator auction = new Auction();
        Colleague bidder1 = new Bidder("Alam", auction);
        Colleague bidder2 = new Bidder("Jack", auction);
        Colleague bidder3 = new Bidder("Ana", auction);

        bidder1.placeBid(1000);
        bidder2.placeBid(2000);
        bidder3.placeBid(3000);
    }
}
