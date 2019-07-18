package Game;

import CardModel.Deck;

import java.util.ArrayList;

/**
 * Created by Tunc on 17.07.2019.
 */
public class ShieldZone {

    private ArrayList<Card> shields;

    public ShieldZone(){}

    /**
     *
     * @param deck
     *
     * Gets the card on top of the deck
     */
    public void addShield(Deck deck){
        shields.add(deck.getTop());
    }

    public Card deleteShield(int index){
        Card card = shields.get(index);
        shields.remove(index);

        return card;
    }

}
