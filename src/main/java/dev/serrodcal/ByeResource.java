package dev.serrodcal;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/bye")
public class ByeResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String bye() {
        return "Bye from Quarkus REST";
    }

}
