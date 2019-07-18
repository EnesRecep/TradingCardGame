package Game;

import CardModel.Card;

import java.util.ArrayList;

/**
 * Created by Tunc on 17.07.2019.
 */
public class Hand {

    private ArrayList<Card> cards;

    public void addCard(Card card){
        cards.add(card);
    }

    public void deleteCard(Card card){
        cards.remove(card);
    }
}
