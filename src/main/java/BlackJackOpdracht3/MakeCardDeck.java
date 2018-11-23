package BlackJackOpdracht3;

import java.util.ArrayList;
import java.util.List;

public class MakeCardDeck extends Card {

    public MakeCardDeck(String value, String icon) {
        super(value, icon);
    }

    static String[] values = {"A", "king", "queen", "jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    static String[] icons = {"♠", "♥", "♣", "♦"};



    static List CardDeck() {
        List<Card> deck;
        deck = new ArrayList();
        for (String i : values) {
            for (String j : icons) {
                String name = i + " of " + j;

                Card card = new Card(i, j);
                deck.add(card);
            }
        }
        return deck;
    }


// voor punten berekenen gebruik cases


}
