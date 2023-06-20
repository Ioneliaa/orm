package com.example.tpd_server.controllers;

import jakarta.ws.rs.*;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/plants-api")
public class PlantsAPIController {
    private static final String API_URL = "https://trefle.io/api/v1/genus?token=tSV7l983diukOQ_hlKEVYTtiTdUpiuPRiSI4XcbgqXE";

    @GET
    @Produces("application/json")
    public String getAll() {
        Client client = ClientBuilder.newClient();
        Response response = client.target(API_URL)
                .request(MediaType.APPLICATION_JSON)
                .get();

        if (response.getStatus() == Response.Status.OK.getStatusCode()) {
            return response.readEntity(String.class);
        } else {
            return "Error sending GET request. Response code: " + response.getStatus();
        }
    }
}
