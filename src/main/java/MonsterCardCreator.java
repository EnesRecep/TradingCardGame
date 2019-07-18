import CardModel.Card;
import CardModel.Civilization;
import CardModel.Race;
import CardModel.Type;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Enes Recep on 17.07.2019.
 */

public class MonsterCardCreator {

    public static ArrayList<Card> create(){
        ArrayList<Card> cards = new ArrayList<>();
        Object obj = null;
        try {
            obj = new JSONParser().parse(new FileReader("C:\\Users\\Enes Recep\\Desktop\\TradingCardGame\\cardsWithPictures.json"));
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = (JSONObject) obj;
        JSONArray ja = (JSONArray) jsonObject.get("cards");

        // iterating phoneNumbers
        Iterator itr = ja.iterator();


        while (itr.hasNext()) {
            Card card = new Card();
            card.setName(((JSONObject)itr).get("name").toString())
            .setLevel((Integer)((JSONObject)itr).get("level"))
            .setType(Type.valueOf(((JSONObject)itr).get("type").toString()));

            String[] cardTexts = ((JSONObject)itr).get("card_text").toString().split("\n");
            for(String str : cardTexts){
                card.addCardText(str.trim());
            }

            String[] flavorTexts = ((JSONObject)itr).get("flavor_text").toString().split("\n");
            for(String str : flavorTexts){
                card.addFlavorText(str.trim());
            }

            String[] civilizations = ((JSONObject)itr).get("civilization").toString().split("/");
            for(String str : civilizations){
                card.addCivilization(Civilization.valueOf(str.trim()));
            }

            if(card.getType().equals(Type.Spell)){
                card.
                        setPower((Integer)((JSONObject)itr).get("power"))
                        .setRace(Race.valueOf(((JSONObject)itr).get("race").toString()));
            }

            cards.add(card.build());

            System.out.println(card);

        }

        return cards;
    }

}
