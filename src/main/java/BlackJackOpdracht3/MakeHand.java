package BlackJackOpdracht3;

import java.util.ArrayList;
import java.util.List;

public class MakeHand {

    private List hand = new ArrayList<>();

    List addCards(List deck, int amountCards) {
        hand = deck.subList(0, amountCards);
        for (int i = 0; i < amountCards; i++) {
            deck.remove(0);
        }
        deck.subList(0,amountCards ).clear();
        return hand;
    }
}
