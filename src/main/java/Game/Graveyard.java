package Game;

import CardModel.Card;

import java.util.ArrayList;

/**
 * Created by Tunc on 27.07.2019.
 */
public class Graveyard {

    private ArrayList<Card> cards;

    public Graveyard() {
        cards = new ArrayList<>();
    }

    public Graveyard(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card){
        cards.add(card);
    }
}
