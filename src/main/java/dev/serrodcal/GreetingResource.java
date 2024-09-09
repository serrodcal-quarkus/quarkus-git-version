package dev.serrodcal;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWithName(@PathParam("name") String name) {
        return "Hi, " + name;
    }

    @GET
    @Path("/{name}/greeting/{greeting}")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWithNameAndGreeting(@PathParam("name") String name, @PathParam("greeting") String greeting) {
        return greeting + ", " + name;
    }

}
