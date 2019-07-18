package SkillUtils;

import Game.Game;
import Game.Player;

/**
 * Created by Tunc on 18.07.2019.
 */
public class BreakShield implements Skill{

    public void execute(){
        int shieldIndex = 0;    //TODO: Will be taken from user
        Player opponentPlayer = Game.getInstance().getCurrentPlayer().getOpponentPlayer();
        //shieldIndex = getTargetShield;
        Card brokenShield = opponentPlayer.getShieldZone().deleteShield(shieldIndex);
        //TODO: If broken shield is a spell card and has a shield blast ability player can choose to execute the ability
        opponentPlayer.getHand().addCard(brokenShield);
    }
}
