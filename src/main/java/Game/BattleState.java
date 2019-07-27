package Game;

import CardModel.Card;

import java.util.ArrayList;

/**
 * Created by Tunc on 19.07.2019.
 */
public class BattleState implements TurnState {

    private Turn turn;

    public BattleState(Turn turn) {
        this.turn = turn;
    }


    @Override
    public void playCard(ArrayList<Card> cards) {
        Card attackerCard = cards.get(0), defenderCard = cards.get(1);
        Player opponent = Game.getInstance().getCurrentPlayer().getOpponentPlayer();
        Player currentPlayer = Game.getInstance().getCurrentPlayer();

        if(opponent.getShieldZone().getShields().contains(defenderCard)){
            opponent.getShieldZone().breakShield(defenderCard);
        }else{
            if(attackerCard.getPower() > defenderCard.getPower()){
                opponent.getZone().removeCard(defenderCard);
                opponent.getGraveyard().addCard(defenderCard);
                //TODO: Tap the attacker card (? check if the defender tapped)
            }else if(attackerCard.getPower() == defenderCard.getPower()){
                opponent.getZone().removeCard(defenderCard);
                opponent.getGraveyard().addCard(defenderCard);
                currentPlayer.getZone().removeCard(attackerCard);
                currentPlayer.getGraveyard().addCard(attackerCard);
            }else{
                currentPlayer.getZone().removeCard(attackerCard);
                currentPlayer.getGraveyard().addCard(attackerCard);
            }
        }
    }

    @Override
    public void endPhase() {
        turn.changeState(new ManaState(turn));
        Game.getInstance().setCurrentPlayer(Game.getInstance().getCurrentPlayer().getOpponentPlayer());
    }
}
