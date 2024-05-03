package com.libros.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

    public String obtenerDatos(String url){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            // Manejar la excepción de manera específica
            System.err.println("Error al enviar/recibir la solicitud HTTP: " + e.getMessage());
            // Puedes lanzar una RuntimeException con un mensaje personalizado
            throw new RuntimeException("Error al enviar/recibir la solicitud HTTP", e);
        }
        String json = response.body();
        return json;

    }



}
