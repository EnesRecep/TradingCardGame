package Game;

import CardModel.Deck;

/**
 * Created by Tunc on 17.07.2019.
 */
public class Player {

    private Deck playerDeck;
    private Shield shield;
    private Hand hand;
    private Zone zone;
    private ManaZone manaZone;

    public Deck getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(Deck playerDeck) {
        this.playerDeck = playerDeck;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
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
