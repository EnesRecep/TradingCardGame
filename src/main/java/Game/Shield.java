package Game;

import CardModel.Deck;

import java.util.ArrayList;

/**
 * Created by Tunc on 17.07.2019.
 */
public class Shield {

    private ArrayList<Card> shields;

    public Shield(){}

    public void addShield(Deck deck){
        shields.add(deck.getTop());
    }
}
