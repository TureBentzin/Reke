package de.bentzin.reke.web;


import org.jetbrains.annotations.Nullable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ture Bentzin
 * @since 16-12-2024
 */

@XmlType(name = "nameAlias", namespace = "http://eu.europa.ec/fpi/fsd/export")
public class NameAlias {

    @Nullable
    private String firstName;

    @Nullable
    private String middleName;

    @Nullable
    private String lastName;

    @Nullable
    private String wholeName;

    @Nullable
    private String function;

    @Nullable
    private String gender;

    @Nullable
    private String title;

    @Nullable
    private String nameLanguage;

    @Nullable
    private String strong;

    @Nullable
    private String regulationLanguage;

    @Nullable
    private String logicalId;

    @Nullable
    public String getLogicalId() {
        return logicalId;
    }

    @XmlAttribute(name = "logicalId")
    public void setLogicalId(@Nullable String logicalId) {
        this.logicalId = logicalId;
    }

    @Nullable
    public String getRegulationLanguage() {
        return regulationLanguage;
    }

    @XmlAttribute(name = "regulationLanguage")
    public void setRegulationLanguage(@Nullable String regulationLanguage) {
        this.regulationLanguage = regulationLanguage;
    }

    @Nullable
    public String getStrong() {
        return strong;
    }

    @XmlAttribute(name = "strong")
    public void setStrong(@Nullable String strong) {
        this.strong = strong;
    }

    @Nullable
    public String getNameLanguage() {
        return nameLanguage;
    }

    @XmlAttribute(name = "nameLanguage")
    public void setNameLanguage(@Nullable String nameLanguage) {
        this.nameLanguage = nameLanguage;
    }

    @Nullable
    public String getTitle() {
        return title;
    }

    @XmlAttribute(name = "title")
    public void setTitle(@Nullable String title) {
        this.title = title;
    }

    @Nullable
    public String getGender() {
        return gender;
    }

    @XmlAttribute(name = "gender")
    public void setGender(@Nullable String gender) {
        this.gender = gender;
    }

    @Nullable
    public String getFunction() {
        return function;
    }

    @XmlAttribute(name = "function")
    public void setFunction(@Nullable String function) {
        this.function = function;
    }

    @Nullable
    public String getWholeName() {
        return wholeName;
    }

    @XmlAttribute(name = "wholeName")
    public void setWholeName(@Nullable String wholeName) {
        this.wholeName = wholeName;
    }

    @Nullable
    public String getLastName() {
        return lastName;
    }

    @XmlAttribute(name = "lastName")
    public void setLastName(@Nullable String lastName) {
        this.lastName = lastName;
    }

    @Nullable
    public String getMiddleName() {
        return middleName;
    }

    @XmlAttribute(name = "middleName")
    public void setMiddleName(@Nullable String middleName) {
        this.middleName = middleName;
    }

    @Nullable
    public String getFirstName() {
        return firstName;
    }

    @XmlAttribute(name = "firstName")
    public void setFirstName(@Nullable String firstName) {
        this.firstName = firstName;
    }
}
