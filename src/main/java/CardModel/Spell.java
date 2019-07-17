package CardModel;

import java.util.ArrayList;

/**
 * Created by Enes Recep on 17.07.2019.
 */
public class Spell {


    private String name;
    private ArrayList<Civilization> civilization;
    private int level;
    private ArrayList<String> cardText;
    private ArrayList<String> flavorText;
    private Type type;


    public Spell() {
    }



    public String getName() {
        return name;
    }

    public Spell setName(String name) {
        this.name = name;
        return this;

    }

    public ArrayList<Civilization> getCivilization() {
        return civilization;
    }

    public Spell setCivilization(Civilization civilization) {
        this.civilization.add(civilization);
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Spell setLevel(int level) {
        this.level = level;
        return this;
    }

    public ArrayList<String> getCardText() {
        return cardText;
    }

    public Spell setCardText(String cardText) {
        this.cardText.add(cardText);
        return this;
    }

    public ArrayList<String> getFlavorText() {
        return flavorText;
    }

    public Spell setFlavorText(String flavorText) {
        this.flavorText.add(flavorText);
        return this;
    }

    public Type getType() {
        return type;
    }

    public Spell setType(Type type) {
        this.type = type;
        return this;
    }

    public Spell build(){
        return this;
    }
}
