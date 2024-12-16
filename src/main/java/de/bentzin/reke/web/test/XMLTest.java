package de.bentzin.reke.web.test;


import de.bentzin.reke.web.SanctionList;
import org.jetbrains.annotations.NotNull;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.transform.Source;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;

/**
 * @author Ture Bentzin
 * @since 16-12-2024
 */
public class XMLTest {


    @NotNull
    public static final String XML = """
            
            <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
            <export xmlns="http://eu.europa.ec/fpi/fsd/export" generationDate="2024-12-11T21:24:35.826+01:00" globalFileId="171703">
                <sanctionEntity designationDetails="" unitedNationId="" logicalId="13">
                    <remark>UNSC RESOLUTION 1483</remark>
                    <regulation regulationType="regulation" organisationType="commission" publicationDate="2003-07-08" entryIntoForceDate="2003-07-07" numberTitle="1210/2003 (OJ L169)" programme="IRQ" logicalId="348">
                        <publicationUrl>http://eur-lex.europa.eu/LexUriServ/LexUriServ.do?uri=OJ:L:2003:169:0006:0023:EN:PDF</publicationUrl>
                    </regulation>
                    <subjectType code="person" classificationCode="P"/>
                    <nameAlias firstName="Saddam" middleName="" lastName="Hussein Al-Tikriti" wholeName="Saddam Hussein Al-Tikriti" function="" gender="M" title="" nameLanguage="" strong="true" regulationLanguage="en" logicalId="17">
                        <regulationSummary regulationType="regulation" publicationDate="2003-07-08" numberTitle="1210/2003 (OJ L169)" publicationUrl="http://eur-lex.europa.eu/LexUriServ/LexUriServ.do?uri=OJ:L:2003:169:0006:0023:EN:PDF"/>
                    </nameAlias>
                    <nameAlias firstName="" middleName="" lastName="" wholeName="Abu Ali" function="" title="" nameLanguage="" strong="true" regulationLanguage="en" logicalId="19">
                        <regulationSummary regulationType="regulation" publicationDate="2003-07-08" numberTitle="1210/2003 (OJ L169)" publicationUrl="http://eur-lex.europa.eu/LexUriServ/LexUriServ.do?uri=OJ:L:2003:169:0006:0023:EN:PDF"/>
                    </nameAlias>
                    <nameAlias firstName="" middleName="" lastName="" wholeName="Abou Ali" function="" title="" nameLanguage="FR" strong="true" regulationLanguage="en" logicalId="380">
                        <regulationSummary regulationType="regulation" publicationDate="2003-07-08" numberTitle="1210/2003 (OJ L169)" publicationUrl="http://eur-lex.europa.eu/LexUriServ/LexUriServ.do?uri=OJ:L:2003:169:0006:0023:EN:PDF"/>
                    </nameAlias>
                    <citizenship region="" countryIso2Code="IQ" countryDescription="IRAQ" regulationLanguage="en" logicalId="1">
                        <regulationSummary regulationType="regulation" publicationDate="2003-07-08" numberTitle="1210/2003 (OJ L169)" publicationUrl="http://eur-lex.europa.eu/LexUriServ/LexUriServ.do?uri=OJ:L:2003:169:0006:0023:EN:PDF"/>
                    </citizenship>
                    <birthdate circa="false" calendarType="GREGORIAN" city="al-Awja, near Tikrit" zipCode="" birthdate="1937-04-28" dayOfMonth="28" monthOfYear="4" year="1937" region="" place="" countryIso2Code="IQ" countryDescription="IRAQ" regulationLanguage="en" logicalId="14">
                        <regulationSummary regulationType="regulation" publicationDate="2003-07-08" numberTitle="1210/2003 (OJ L169)" publicationUrl="http://eur-lex.europa.eu/LexUriServ/LexUriServ.do?uri=OJ:L:2003:169:0006:0023:EN:PDF"/>
                    </birthdate>
                </sanctionEntity>
            </export>
            """;

    public static void main(String[] args) {

        parseXML(XML);

    }

    public static void parseXML(@NotNull String content) {
        try {
            File xmlFile = new File("test.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(SanctionList.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            SanctionList sanctionList = (SanctionList) unmarshaller.unmarshal(xmlFile);
            System.out.println(sanctionList);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
