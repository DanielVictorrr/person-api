package br.init.resource;  //caminho da pasta inicial. indica onde a classe tá. Na pasta resource

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/person") //nome que dá para o endpoint. Nome que chama no browser
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Gabriel from Quarkus REST";
    }

    @GET
    @Path("/Name")
    @Produces(MediaType.TEXT_PLAIN)
    public String getByName(String name) {
        return "Hello Gabriel from Quarkus REST";
    }
}
