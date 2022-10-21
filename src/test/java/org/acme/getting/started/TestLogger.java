package org.acme.getting.started;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {
    static {
        System.setProperty("GOOGLE_APPLICATION_CREDENTIALS", "/home/andris/git/cloud-logging/src/main/resources/gcloud-8250cecb5823.json");
    }

    private static final Logger logger = LoggerFactory.getLogger(GreetingService.class);

    @Test
    public void testLogger() {
        logger.warn("Logger works. cool!");
    }
}
