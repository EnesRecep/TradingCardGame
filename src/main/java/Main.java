import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Enes Recep on 6.07.2019.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {


        MonsterCardClassCreator creator = new MonsterCardClassCreator();




        if(1==1)
            return;
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();


        JSONArray jsonArray = new JSONArray();

        for(int i = 1 ; i <= 1138 ; i++){
            driver.get("http://www.kaijudochannel.com/card/" + i);

            JSONObject object = new JSONObject();
            System.out.println("Name");
            String name = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/h1")).getText();
            System.out.println(name);
            object.put("name",name);


            String picURL = driver.findElement(By.xpath("/html/body/div[2]/div[1]/img")).getAttribute("src");
            System.out.println(picURL);
            object.put("pic",picURL);

            System.out.println("level");
            String level = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[1]")).getText();
            System.out.println(level);
            object.put("level", level.split(":")[1]);

            System.out.println("type");
            String type = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]")).getText();
            System.out.println(type);
            object.put("type", type.split(":")[1]);

            if(driver.findElements( By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[3]") ).size() != 0) {
                System.out.println("civilization");
                String civilization = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[3]")).getText();
                System.out.println(civilization);
                object.put("civilization", civilization.split(":")[1]);
            }

            if(driver.findElements( By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[1]") ).size() != 0) {
                System.out.println("power");
                String power = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[1]")).getText();
                System.out.println(power);
                object.put("power", power.split(":")[1]);
            }
            if(driver.findElements( By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]") ).size() != 0) {
                System.out.println("race");
                String race = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[2]")).getText();
                System.out.println(race);
                object.put("race", race.split(":")[1]);
            }

            if(driver.findElements( By.xpath("/html/body/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]/p") ).size() != 0) {
                System.out.println("card text");
                String cardText = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]")).getText();
                object.put("card_text", cardText);
            }

            if(driver.findElements( By.xpath("/html/body/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[2]/em") ).size() != 0) {
                System.out.println("flavorText");
                String flavorText = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[2]/em")).getText();
                System.out.println(flavorText);
                object.put("flavor_text", flavorText);

            }
            System.out.println("----------------------------------------------------");

            jsonArray.add(object);

        }


        try (FileWriter file = new FileWriter("cardsWithPictures.json")) {
            file.write(beautify(jsonArray.toJSONString()));
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + jsonArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String beautify(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Object obj = mapper.readValue(json, Object.class);
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }
}
