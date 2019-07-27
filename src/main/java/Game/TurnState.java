package Game;

/**
 * Created by Tunc on 25.07.2019.
 */
import CardModel.Card;

import java.util.ArrayList;

/**
 * Created by Tunc on 19.07.2019.
 */
public interface TurnState {

    public void playCard(ArrayList<Card> cards);

    public void endPhase();


}
