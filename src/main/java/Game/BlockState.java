package Game;

import CardModel.Card;

import java.util.ArrayList;

/**
 * Created by Tunc on 27.07.2019.
 */
public class BlockState implements TurnState {

    private Turn turn;

    public BlockState(Turn turn) {
        this.turn = turn;
    }

    @Override
    public void playCard(ArrayList<Card> cards) {

    }

    @Override
    public void endPhase() {

        turn.changeState(new BattleState(turn));
    }
}
