package org.acme.getting.started;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/echo")
public class EchoResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{message}")
    public String echo(String message) {
        return message;
    }
}
