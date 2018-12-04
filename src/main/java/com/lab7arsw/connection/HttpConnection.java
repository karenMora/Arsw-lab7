/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the tem plate in the editor.
 */
package com.lab7arsw.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpHeaders.USER_AGENT;
import org.springframework.stereotype.Service;

/**
 *
 * @author karen
 */
@Service
public class HttpConnection {
    /*
    @Autowired
    private String url;
    private String resultado;
    private static final String USER_AGENT = "Mozilla/5.0";
    
    public void connect(String accion, String select) {
        url=accion+select;
    }

    public void run() throws Exception{
        try{
            URL obj =new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);
            StringBuffer response=new StringBuffer();
            //The following invocation perform the connection implicitly before getting the code
            int responseCode = con.getResponseCode();
            System.out.println("GET Response Code :: " + responseCode);
            
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        con.getInputStream()));
                String inputLine;
                
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
            }else{
                System.out.println("NO FUNCIONA");
            }
            System.out.println("Funciona");
            resultado=response.toString();
        }catch(MalformedURLException ex){
            Logger.getLogger(HttpConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HttpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public String getResult() {
        return resultado;
    }
    */
    private static String GET_URL = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static String GET_ID ="&appid=Q1QZFVJQ21K7C6XM";
    
    public static String getJson(String city) throws IOException{
        String url=GET_URL + city + GET_ID;
        URL obj =new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        String jsonString="";
        
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            jsonString=response.toString();
        }
        return jsonString;
    }
}
