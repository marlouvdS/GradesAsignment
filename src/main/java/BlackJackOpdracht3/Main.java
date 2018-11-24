package BlackJackOpdracht3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List deck = MakeCardDeck.CardDeck();
        System.out.println(deck.size());
       MakeHand hand= new MakeHand(deck, 2);
        System.out.println(deck.size());
        System.out.println(hand.getClass());

    }
}
