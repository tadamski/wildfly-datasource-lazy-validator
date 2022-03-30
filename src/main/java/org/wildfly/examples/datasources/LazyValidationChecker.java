package org.wildfly.examples.datasources;

import org.jboss.jca.adapters.jdbc.spi.ValidConnectionChecker;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

public class LazyValidationChecker implements ValidConnectionChecker {
    Logger logger = Logger.getLogger(LazyValidationChecker.class.getName());

    public SQLException isValidConnection(Connection c) {
        logger.info("Everything is fine...");
        return null;
    }
}
