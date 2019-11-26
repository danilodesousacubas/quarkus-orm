package org.quarkus.modules.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.quarkus.modules.model.Fruit;
import org.quarkus.modules.service.FruitService;

@Path("/fruit")
public class FruitResource {
    
    @Inject
    private FruitService fruitService;
    
    @POST
    public void create() {
        fruitService.createFruit("Apple");    
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Fruit findOne() {
        Fruit fruit = new Fruit();
        fruit.setName("Orange");
        return fruit;
    }
}