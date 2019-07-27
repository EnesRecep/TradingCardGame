package CardModel;

import java.util.ArrayList;

/**
 * Created by Tunc on 17.07.2019.
 */
public class Deck {

    private ArrayList<Card> cards;

    public Card getTop(){

        Card card = cards.get(0);
        removeCard(card);
        return card;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void removeCard(Card card){
        cards.remove(card);
    }
}
