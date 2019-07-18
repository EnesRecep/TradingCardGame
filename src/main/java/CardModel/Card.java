package CardModel;

import java.util.ArrayList;

/**
 * Created by Enes Recep on 17.07.2019.
 */
public class Card {


    private String name;
    private ArrayList<Civilization> civilization = new ArrayList<>();
    private ArrayList<String> race = new ArrayList<>();
    private int level;
    private ArrayList<String> cardText = new ArrayList<>();
    private ArrayList<String> flavorText = new ArrayList<>();
    private Type type;
    private int power;


    public Card() {
    }

    public int getPower() {
        return power;
    }

    public Card setPower(int power) {
        this.power = power;
        return this;
    }


    public String getName() {
        return name;
    }

    public Card setName(String name) {
        this.name = name;
        return this;

    }

    public ArrayList<Civilization> getCivilization() {
        return civilization;
    }

    public Card addCivilization(Civilization civilization) {
        this.civilization.add(civilization);
        return this;
    }

    public ArrayList<String> getRace() {
        return race;
    }

    public Card addRace(String race) {
        this.race.add(race);
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Card setLevel(int level) {
        this.level = level;
        return this;
    }

    public ArrayList<String> getCardText() {
        return cardText;
    }

    public Card addCardText(String cardText) {
        this.cardText.add(cardText);
        return this;
    }

    public ArrayList<String> getFlavorText() {
        return flavorText;
    }

    public Card addFlavorText(String flavorText) {
        this.flavorText.add(flavorText);
        return this;
    }

    public Type getType() {
        return type;
    }

    public Card setType(Type type) {
        this.type = type;
        return this;
    }

    public Card build(){
        return this;
    }


    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", civilization=" + civilization +
                ", race=" + race +
                ", level=" + level +
                ", cardText=" + cardText +
                ", flavorText=" + flavorText +
                ", type=" + type +
                ", power=" + power +
                '}' + "\n";
    }
}
