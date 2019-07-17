package CardModel;

import java.util.ArrayList;

/**
 * Created by Enes Recep on 17.07.2019.
 */
public class Monster {


    private String name;
    private ArrayList<Civilization> civilization;
    private ArrayList<Race> race;
    private int level;
    private ArrayList<String> cardText;
    private ArrayList<String> flavorText;
    private Type type;

    private int power;

    public Monster() {
    }

    public int getPower() {
        return power;
    }

    public Monster setPower(int power) {
        this.power = power;
        return this;
    }


    public String getName() {
        return name;
    }

    public Monster setName(String name) {
        this.name = name;
        return this;

    }

    public ArrayList<Civilization> getCivilization() {
        return civilization;
    }

    public Monster setCivilization(Civilization civilization) {
        this.civilization.add(civilization);
        return this;
    }

    public ArrayList<Race> getRace() {
        return race;
    }

    public Monster setRace(Race race) {
        this.race.add(race);
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Monster setLevel(int level) {
        this.level = level;
        return this;
    }

    public ArrayList<String> getCardText() {
        return cardText;
    }

    public Monster setCardText(String cardText) {
        this.cardText.add(cardText);
        return this;
    }

    public ArrayList<String> getFlavorText() {
        return flavorText;
    }

    public Monster setFlavorText(String flavorText) {
        this.flavorText.add(flavorText);
        return this;
    }

    public Type getType() {
        return type;
    }

    public Monster setType(Type type) {
        this.type = type;
        return this;
    }

    public Monster build(){
        return this;
    }
}
