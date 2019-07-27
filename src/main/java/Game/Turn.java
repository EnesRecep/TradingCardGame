package Game;

import CardModel.Card;

import java.util.ArrayList;

/**
 * Created by Tunc on 19.07.2019.
 */
public class Turn {

    private TurnState turnState;

    public Turn() {
    }

    public Turn(TurnState turnState){
        this.turnState = turnState;
    }
    public TurnState getTurnState() {
        return turnState;
    }

    public void setTurnState(TurnState turnState) {
        this.turnState = turnState;
    }

    public void playCard(ArrayList<Card> cards){
        turnState.playCard(cards);
    }

    public void endState(){
        turnState.endPhase();
    }

    public void changeState(TurnState turnState){
        this.turnState = turnState;
    }
}
