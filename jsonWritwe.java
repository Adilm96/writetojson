import java.io.FileWriter;
import java.io.IOException;

public class jsonWritwe {

    public static void main(String[] args) {

        //first country
        JSONObject country1 = new JSONObject();
        country1.put("country", "Ghana");
        country1.put("year", "1990");
        country1.put("total population", "2mil");

        JSONObject countryObject = new JSONObject();
        countryObject.put("country", country1);

        //Second country
        JSONObject country2 = new JSONObject();
        country2.put("country", "Marocco");
        country2.put("year", "2010");
        country2.put("total", "population");

        JSONObject countryObject2 = new JSONObject();
        countryObject2.put("country", country2);

        //Add country to list
        JSONArray countryList = new JSONArray();
        countryList.add(countryObject);
        countryList.add(countryObject2);

        //write to jsonfile
        try(FileWriter file = new FileWriter("")) {

            file.write(countryList.toJSONString());
            file.flush();

        }catch (IOException e){
            e.printStackTrace();
        }

    }



}
