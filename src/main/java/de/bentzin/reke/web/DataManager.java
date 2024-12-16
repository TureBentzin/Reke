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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
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

    @NotNull
    private static final String URL = "https://webgate.ec.europa.eu/fsd/fsf/public/files/xmlFullSanctionsList/content?token=dG9rZW4tMjAxNw";

    public DataManager() {

    }

    /**
     * @return number of sanctions uodated
     */
    public int update() {
        logger.info("Downloading sanctions list from: {}", URL);
        try {
            InputStream inputStream = new URL(URL).openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            reader.close();
            inputStream.close();
            String content = builder.toString();
            logger.info("Downloaded {} bytes.", content.length());
            parseXML(content);
            return 0;
        } catch (IOException e) {
            logger.error("Failed to download sanctions list.", e);
            return 0;
        }
    }

    private void parseXML(@NotNull String content) {
        try {
            JAXBContext context = JAXBContext.newInstance(SanctionList.class);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
