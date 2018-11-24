package BlackJackOpdracht3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakeCardDeck extends Card {

    public MakeCardDeck(String value, String icon) {
        super(value, icon);
    }

    static String[] values = {"A", "king", "queen", "jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    static String[] icons = {"♠", "♥", "♣", "♦"};


    static List CardDeck() {
        List<Card> deck = new ArrayList();
        for (String i : values) {
            for (String j : icons) {
                String name = i + " of " + j;
                Card card = new Card(i, j);
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
        return deck;
    }


    // voor punten berekenen gebruik cases
    static int getPoints(Card card) {
        int points = 0;
        switch (card.getValue()) {
            case "A":
                points = 1;
                break;
            case "queen":
            case "king":
            case "jack":
            case "10":
                points = 10;
                break;
            case "9":
                points = 9;
                break;
            case "8":
                points = 8;
                break;
            case "7":
                points = 7;
                break;
            case "6":
                points = 6;
                break;
            case "5":
                points = 5;
                break;
            case "4":
                points = 4;
                break;
            case "3":
                points = 3;
                break;
            case "2":
                points = 2;
                break;
        }
        return points;
    }


}
