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

    public ArrayList<Card> getShields() {
        return shields;
    }

    public void setShields(ArrayList<Card> shields) {
        this.shields = shields;
    }

    public void breakShield(Card targetShield){
        shields.remove(targetShield);
    }

    public Card getShield(int index){
        return shields.get(index);
    }

    public void removeShield(Card card){
        shields.remove(card);
    }

}
