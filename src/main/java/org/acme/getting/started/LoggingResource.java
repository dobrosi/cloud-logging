package org.acme.getting.started;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/log")
public class LoggingResource {
    private final Logger logger = LoggerFactory.getLogger(LoggingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/info/{message}")
    public String info(String message) {
        logger.info(message);
        return "OK";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/warn/{message}")
    public String warn(String message) {
        logger.warn(message);
        return "OK";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/error/{message}")
    public String error(String message) {
        logger.error(message);
        return "OK";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/info/{message}")
    public String infoPost(String message) {
        logger.info(message);
        return "OK";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/warn/{message}")
    public String warnPost(String message) {
        logger.warn(message);
        return "OK";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/error")
    public String errorPost(String message) {
        logger.error(message);
        return "OK";
    }
}
