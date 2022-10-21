package org.acme.getting.started;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    private static final Logger logger = LoggerFactory.getLogger(GreetingService.class);

    public String greeting(String name) {
        logger.warn("Cool!");
        return "hello " + name;
    }

}
