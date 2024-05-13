package com.aluracursos.conversorDeMonedas.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


    //Generación de dirección para uso de API
    // "https://v6.exchangerate-api.com/v6/d18132b33f1d2d97e09fbd4c/latest/USD"

public class ConsultaApi {


     public Monedas buscaMonedas(String busqueda){

         String APIKEY = "d18132b33f1d2d97e09fbd4c";
         String URL    = "https://v6.exchangerate-api.com/v6/"+ APIKEY + "/latest/"+busqueda;

         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
                 .uri(URI.create(URL))
                 .build();

         HttpResponse<String> response = null;
         try {
             response = client
                     .send(request, HttpResponse.BodyHandlers.ofString());
             return new Gson().fromJson(response.body(),Monedas.class);

         } catch (IOException|InterruptedException e) {
             throw new RuntimeException("Moneda no encontrada");
         }

    }
}
