package school.services;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class PublicHolidayService {

    private static final String COUNTRY_CODE = "EE";
    private static final String API_URL = "https://date.nager.at/api/v2/PublicHolidays/";

    public List<ZonedDateTime> getPublicHolidays(String year) {
        List<ZonedDateTime> result = new ArrayList<>();
        String composedUrl = API_URL + year + "/" + COUNTRY_CODE;

        try {
            URL url = new URL(composedUrl);
            URLConnection yc = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            String dateString;
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM DD");


            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);

                JSONArray jsonArray = new JSONArray(inputLine);
                
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    dateString = jsonObject.getString("date");

                    LocalDate date = LocalDate.parse(dateString); //LocalDate date = LocalDate.parse(dateString, formatter);
                    ZonedDateTime zonedResult  = date.atStartOfDay(ZoneId.of("UTC"));



                    //if (zonedResult.getDayOfWeek() == DayOfWeek.SATURDAY || zonedResult.getDayOfWeek() == DayOfWeek.SUNDAY) {

                    //}

                    result.add(zonedResult);
                    System.out.println(zonedResult);
                    System.out.println(zonedResult.getDayOfWeek());
                }


            }
            in.close();

        } catch (Exception ex) {

        }

        return result;
    }

}
