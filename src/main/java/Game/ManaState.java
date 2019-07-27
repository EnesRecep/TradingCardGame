package Game;

import CardModel.Card;
import java.util.ArrayList;

/**
 * Created by Tunc on 19.07.2019.
 */
public class ManaState implements TurnState {

    private Turn turn;

    public ManaState(Turn turn) {
        this.turn = turn;
        draw();
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }

    public void draw(){
        Player player = Game.getInstance().getCurrentPlayer();

        player.getHand().addCard(player.getPlayerDeck().getTop());
    }

    @Override
    public void playCard(ArrayList<Card> cards) {
        Game.getInstance().getCurrentPlayer().getManaZone().addCard(cards.get(0));
    }

    @Override
    public void endPhase() {
        turn.changeState(new MainState(turn));
    }
}
