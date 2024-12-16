package de.bentzin.reke.web;

import de.bentzin.reke.Bot;
import de.bentzin.reke.DBChannel;
import de.bentzin.reke.SendOrder;
import kotlin.Pair;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.EmbedType;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.requests.restaction.MessageCreateAction;
import net.dv8tion.jda.internal.entities.EntityBuilder;
import net.dv8tion.jda.internal.utils.Helpers;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ture Bentzin
 * @since 26-03-2024
 */
public class DataManager {
    @NotNull
    public static final Logger logger = LoggerFactory.getLogger(DataManager.class);

    public DataManager() {

    }

    /**
     * @return number of sanctions uodated
     */
    public int update() {
        logger.warn("Not implemented yet.");
        return 0;
    }
}
