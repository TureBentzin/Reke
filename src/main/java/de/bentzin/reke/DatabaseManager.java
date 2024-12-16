package de.bentzin.reke;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.*;

/*
 This database will store the following data:
 - Guilds (guildid, channel, event_link)
 - Files  (url, name, topic)
 - History (channel, url)
 */

/**
 * @author Ture Bentzin
 * @since 26-03-2024
 */
public class DatabaseManager {

    @NotNull
    public static final Logger logger = LoggerFactory.getLogger(DatabaseManager.class);
    @NotNull
    private final String sqlitePath;

    @NotNull
    private final Set<Connection> connections = new HashSet<>();

    protected DatabaseManager(@NotNull String sqlitePath) {
        this.sqlitePath = sqlitePath;
    }

    public synchronized void close() {
        connections.forEach(connection -> {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
        connections.clear();
    }

    @NotNull
    public synchronized Connection connect() {
        try {
            if (Bot.debug) logger.debug("Connecting to database: {}", sqlitePath);
            Connection connection = DriverManager.getConnection("jdbc:sqlite:" + sqlitePath);
            connections.add(connection);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /* Specialized methods for the database */

    public void createTables() {
        try (Connection connection = connect()) {
            logger.info("Creating tables in database...");
            //connection.createStatement().execute("CREATE TABLE IF NOT EXISTS guilds (guildid INTEGER, channel INTEGER PRIMARY KEY, event_link TEXT)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
