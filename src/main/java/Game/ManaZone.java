package Game;

import CardModel.Card;

import java.util.ArrayList;

/**
 * Created by Tunc on 17.07.2019.
 */
public class ManaZone {

    private ArrayList<Card> cards;

    public void addCard(Card card){
        cards.add(card);
    }

    public void removeCard(Card card){
        cards.remove(card);
    }
}
