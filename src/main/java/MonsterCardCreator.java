import CardModel.Card;
import CardModel.Civilization;
import CardModel.Race;
import CardModel.Type;
import org.apache.commons.io.FileUtils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Enes Recep on 17.07.2019.
 */

public class MonsterCardCreator {

    public static ArrayList<Card> create() {
        ArrayList<Card> cards = new ArrayList<>();

        File file = new File("C:\\Users\\Enes Recep\\Desktop\\TradingCardGame\\cardsWithPictures.json");
        String content = null;
        try {
            content = FileUtils.readFileToString(file, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert JSON string to JSONObject
        JSONObject jsonObject = new JSONObject(content);

        JSONArray ja = (JSONArray) jsonObject.get("cards");

        for (int i = 0; i < ja.length(); i++) {
            Card card = new Card();


            card.setName(ja.getJSONObject(i).getString("name"))
                    .setLevel(Integer.valueOf(ja.getJSONObject(i).getString("level").trim()))
                    .setType(Type.valueOf(ja.getJSONObject(i).getString("type").trim().replace(" ", "")));

            if(ja.getJSONObject(i).has("card_text")) {
                String[] cardTexts = (ja.getJSONObject(i).getString("card_text").split("\n"));
                for (String str : cardTexts) {
                    card.addCardText(str.trim());
                }
            }

            if(ja.getJSONObject(i).has("flavor_text")) {
                String[] flavorTexts = (ja.getJSONObject(i).getString("flavor_text").split("\n"));
                for (String str : flavorTexts) {
                    card.addFlavorText(str.trim());
                }
            }

            String[] civilizations = (ja.getJSONObject(i).getString("civilization").split("/"));
            for (String str : civilizations) {
                card.addCivilization(Civilization.valueOf(str.trim()));
            }

            if (card.getType().equals(Type.Creature) || card.getType().equals(Type.EvolutionCreature)) {
                card.
                        setPower(Integer.valueOf(ja.getJSONObject(i).getString("power").trim()));

                String[] races = (ja.getJSONObject(i).getString("race").split("/"));
                for (String str : races) {
                    card.addRace(str.trim());
                }

            }

            cards.add(card.build());

            System.out.println(card);

        }

        return cards;
    }

}
