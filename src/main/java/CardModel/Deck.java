package CardModel;

import java.util.ArrayList;

/**
 * Created by Tunc on 17.07.2019.
 */
public class Deck {

    private ArrayList<Card> cards;

    public Card getTop(){

        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }
}
