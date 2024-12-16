package de.bentzin.reke.web;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ture Bentzin
 * @since 16-12-2024
 */
@XmlRootElement(name = "export", namespace = "http://eu.europa.ec/fpi/fsd/export")
public class SanctionList {
    @Nullable
    private URI xmlns;

    @Nullable
    private String generationDate;

    @Nullable
    private String globalFileId;

    @NotNull
    private List<SanctionEntity> sanctions = new ArrayList<>();

    @Nullable
    public URI getXmlns() {
        return xmlns;
    }

    @XmlAttribute(name = "xmlns")
    public void setXmlns(@NotNull URI xmlns) {
        System.out.println("xmlns = " + xmlns);
        this.xmlns = xmlns;
    }

    @Nullable
    public String getGenerationDate() {
        return generationDate;
    }

    @XmlAttribute(name = "generationDate")
    public void setGenerationDate(@NotNull String generationDate) {
        System.out.println("generationDate = " + generationDate);
        this.generationDate = generationDate;
    }

    @Nullable
    public String getGlobalFileId() {
        return globalFileId;
    }

    @XmlAttribute(name = "globalFileId")
    public void setGlobalFileId(@NotNull String globalFileId) {
        System.out.println("globalFileId = " + globalFileId);
        this.globalFileId = globalFileId;
    }

    @NotNull
    public List<SanctionEntity> getSanctions() {
        return sanctions;
    }

    @XmlElement(name = "sanctionEntity", namespace = "http://eu.europa.ec/fpi/fsd/export")
    public void setSanctions(@NotNull List<SanctionEntity> sanctions) {
        this.sanctions = sanctions;
    }

    @NotNull
    @Override
    public String toString() {
        return "SanctionList{" +
                "xmlns=" + xmlns +
                ", generationDate='" + generationDate + '\'' +
                ", globalFileId='" + globalFileId + '\'' +
                ", sanctions=" + sanctions +
                '}';
    }
}
