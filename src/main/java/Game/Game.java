package Game;

import CardModel.Deck;

import java.util.ArrayList;

/**
 * Created by Enes Recep on 17.07.2019.
 */
public class Game {

    private Player playerOne;
    private Player playerTwo;

    private static Game gameInstance;

    private Game(){

    }

    public static Game getInstance(){
        if(gameInstance == null){
            gameInstance = new Game();
        }

        return gameInstance;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }
}
