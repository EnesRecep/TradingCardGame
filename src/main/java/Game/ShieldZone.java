package Game;

import CardModel.Card;

import java.util.ArrayList;

/**
 * Created by Tunc on 17.07.2019.
 */
public class ShieldZone {

    private ArrayList<Card> shields;

    public ShieldZone(){}

    public void addShield(Card card){
        shields.add(card);
    }

    /*
    Get shield by index
    This is used when user selects a shield to destroy (might not be needed(Card object might be send to remove), then change to get Card param.)
     */
    public Card getShield(int index){
        return shields.get(index);
    }

    public void removeShield(Card card){
        shields.remove(card);
    }

}
