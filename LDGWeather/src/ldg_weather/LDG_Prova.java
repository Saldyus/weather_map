/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldg_weather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;
import org.dom4j.io.OutputFormat;

/**
 *
 * @author salva
 */
public class LDG_Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, IOException {
        //home
        //PrintStream f = new PrintStream("London.xml");
        PrintStream out = new PrintStream("city.txt");
        URIBuilder builder = new URIBuilder().setScheme("http")
                .setHost("api.openweathermap.org")
                .setPath("data/2.5/weather")
                .addParameter("q", "Ospitaletto")
                .addParameter("mode", "json")
                .addParameter("appid", "d400fec814c6d1b2403716b155b31e84");

        System.out.println(builder.build());

        HttpResponse response = Request.Get(builder.build())
                .execute().returnResponse();

        int returnCode = response.getStatusLine().getStatusCode();
        String body = EntityUtils.toString(response.getEntity());
        //System.out.println(response.returnResponse().getStatusLine());
        OutputFormat format = OutputFormat.createPrettyPrint();
        System.out.println(body);

        Gson gson = new Gson();
        LDG_all all = gson.fromJson(body, LDG_all.class);
        System.out.println(all.getCoord().getLat());
        
        System.out.println("Lettura file: ");
        
        FileReader f = new FileReader("city.txt");
        BufferedReader file = new BufferedReader(f);
//        FileReader f = new FileReader("city.txt");
//        BufferedReader file = new BufferedReader(f); 
        
        String lis = file.readLine();

        /*String lis = file.readLine();
        String lis1 = "";
        int i=1;
     
        while (lis != null) {
            lis1 = lis1 + lis;
            out.print(lis);
            lis = file.readLine();
            System.out.println(lis);
            i+=1;
        }
        
        System.out.println("i: "+i);
        System.out.println(lis);*/

        LDG_City_json city = gson.fromJson(lis, LDG_City_json.class);

        System.out.println(city.getCity().get(0).getName());
//        List<LDG_City> list = city.getCity();

        //proxy scuola: 
        /*URLConnection uc = getConnection("http://api.openweathermap.org/data/2.5/weather?q=Brescia&mode=xml&appid=d400fec814c6d1b2403716b155b31e84");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(
                uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();

        //System.out.println(returnCode);
         */
    }

    public static URLConnection getConnection(String urlname) throws IOException {
        System.setProperty("java.net.useSystemProxies", "true");
        URL url = new URL(urlname);
        URLConnection yc = url.openConnection();
        return yc;
    }

}
