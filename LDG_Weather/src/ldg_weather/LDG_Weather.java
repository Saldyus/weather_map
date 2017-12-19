/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldg_weather;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import static java.sql.DriverManager.getConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 *
 * @author 70657788
 */
public class LDG_Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, IOException {
        /*PrintStream f = new PrintStream("London.xml");
        URIBuilder builder = new URIBuilder().setScheme("http")
                .setHost("api.openweathermap.org")
                .setPath("data/2.5/weather")
                .addParameter("q", "London")
                .addParameter("mode", "xml")
                .addParameter("appid", "d400fec814c6d1b2403716b155b31e84");

        System.out.println(builder.build());

        HttpResponse response = Request.Get(builder.build())
                .execute().returnResponse();

        int returnCode = response.getStatusLine().getStatusCode();
        String body = EntityUtils.toString(response.getEntity());
        //System.out.println(response.returnResponse().getStatusLine());
        OutputFormat format = OutputFormat.createPrettyPrint();
        */
        URLConnection uc = getConnection("http://api.openweathermap.org/data/2.5/weather?q=Brescia&mode=xml&appid=d400fec814c6d1b2403716b155b31e84");
        BufferedReader in = new BufferedReader(new InputStreamReader(
                uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();

        //System.out.println(returnCode);
    }

    public static URLConnection getConnection(String urlname) throws IOException {
        System.setProperty("java.net.useSystemProxies", "true");
        URL url = new URL(urlname);
        URLConnection yc = url.openConnection();
        return yc;
    }

}
