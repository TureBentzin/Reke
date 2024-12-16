package de.bentzin.reke.web;


import org.jetbrains.annotations.Nullable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.net.URL;

/**
 * @author Ture Bentzin
 * @since 16-12-2024
 */
@XmlType(name = "regulation", namespace = "http://eu.europa.ec/fpi/fsd/export")
public class Regulation {

    @Nullable
    private String regulationType;
    @Nullable
    private String organisationType;
    @Nullable
    private String publicationDate;
    @Nullable
    private String entryIntoForceDate;
    @Nullable
    private String numberTitle;
    @Nullable
    private String programme;
    @Nullable
    private String logicalId;

    @Nullable
    private URL publicationUrl;


    @Nullable
    public String getRegulationType() {
        return regulationType;
    }

    @XmlAttribute(name = "regulationType")
    public void setRegulationType(@Nullable String regulationType) {
        this.regulationType = regulationType;
    }

    @Nullable
    public String getOrganisationType() {
        return organisationType;
    }

    @XmlAttribute(name = "organisationType")
    public void setOrganisationType(@Nullable String organisationType) {
        this.organisationType = organisationType;
    }

    @Nullable
    public String getPublicationDate() {
        return publicationDate;
    }

    @XmlAttribute(name = "publicationDate")
    public void setPublicationDate(@Nullable String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Nullable
    public String getEntryIntoForceDate() {
        return entryIntoForceDate;
    }

    @XmlAttribute(name = "entryIntoForceDate")
    public void setEntryIntoForceDate(@Nullable String entryIntoForceDate) {
        this.entryIntoForceDate = entryIntoForceDate;
    }

    @Nullable
    public String getNumberTitle() {
        return numberTitle;
    }

    @XmlAttribute(name = "numberTitle")
    public void setNumberTitle(@Nullable String numberTitle) {
        this.numberTitle = numberTitle;
    }

    @Nullable
    public String getProgramme() {
        return programme;
    }

    @XmlAttribute(name = "programme")
    public void setProgramme(@Nullable String programme) {
        this.programme = programme;
    }

    @Nullable
    public String getLogicalId() {
        return logicalId;
    }

    @XmlAttribute(name = "logicalId")
    public void setLogicalId(@Nullable String logicalId) {
        this.logicalId = logicalId;
    }

    @Nullable
    public URL getPublicationUrl() {
        return publicationUrl;
    }

    @XmlElement(name = "publicationUrl", namespace = "http://eu.europa.ec/fpi/fsd/export")
    public void setPublicationUrl(@Nullable URL publicationUrl) {
        this.publicationUrl = publicationUrl;
    }

    @Override
    public String toString() {
        return "Regulation{" +
                "regulationType='" + regulationType + '\'' +
                ", organisationType='" + organisationType + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", entryIntoForceDate='" + entryIntoForceDate + '\'' +
                ", numberTitle='" + numberTitle + '\'' +
                ", programme='" + programme + '\'' +
                ", logicalId='" + logicalId + '\'' +
                ", publicationUrl=" + publicationUrl +
                '}';
    }
}
