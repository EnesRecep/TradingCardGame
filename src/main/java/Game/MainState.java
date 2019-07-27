package Game;

import CardModel.Card;
import java.util.ArrayList;

/**
 * Created by Tunc on 19.07.2019.
 */
public class MainState implements TurnState {

    private Turn turn;

    public MainState(Turn turn) {
        this.turn = turn;
    }

    //Puts a monster card to the zone or plays a spell card
    @Override
    public void playCard(ArrayList<Card> cards) {
        if("Spell".equalsIgnoreCase(cards.get(0).getType().toString())){

        }
    }

    @Override
    public void endPhase() {
        turn.changeState(new BattleState(turn));
    }


}
