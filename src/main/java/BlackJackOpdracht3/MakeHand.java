package BlackJackOpdracht3;

import java.util.ArrayList;
import java.util.List;

public class MakeHand {

    private int amountCards;
    private List deck;

    public MakeHand(List deck, int amountCards) {
        this.amountCards = amountCards;
        this.deck = deck;
        makeHand(deck, amountCards);
        removeFromDeck(deck, amountCards);
    }


    private static List removeFromDeck(List deck, int amountCards) {
        deck.subList(0, amountCards).clear();
        return deck;
    }

    private static List makeHand(List deck, int amountCards) {
        List hand = new ArrayList<>();
        hand = deck.subList(0, amountCards);
        System.out.println(hand);
        return hand;
    }
}
