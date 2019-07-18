package Game;

import CardModel.Deck;

/**
 * Created by Tunc on 17.07.2019.
 */
public class Player {

    private Deck playerDeck;
    private ShieldZone shieldZone;
    private Hand hand;
    private Zone zone;
    private ManaZone manaZone;
    private Player opponentPlayer;

    public Player getOpponentPlayer() {
        return opponentPlayer;
    }

    public void setOpponentPlayer(Player opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
    }

    public Deck getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(Deck playerDeck) {
        this.playerDeck = playerDeck;
    }

    public ShieldZone getShieldZone() {
        return shieldZone;
    }

    public void setShieldZone(ShieldZone shieldZone) {
        this.shieldZone = shieldZone;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public ManaZone getManaZone() {
        return manaZone;
    }

    public void setManaZone(ManaZone manaZone) {
        this.manaZone = manaZone;
    }

    public void initializeGame(){

    }
}
