package de.bentzin.reke.web;


import org.jetbrains.annotations.Nullable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ture Bentzin
 * @since 16-12-2024
 */
@XmlType(name = "subjectType", namespace = "http://eu.europa.ec/fpi/fsd/export")
public class SubjectType {

    @Nullable
    private String code;

    @Nullable
    private String classificationCode;

    @Nullable
    public String getClassificationCode() {
        return classificationCode;
    }

    @XmlAttribute(name = "classificationCode")
    public void setClassificationCode(@Nullable String classificationCode) {
        this.classificationCode = classificationCode;
    }

    @Nullable
    public String getCode() {
        return code;
    }

    @XmlAttribute(name = "code")
    public void setCode(@Nullable String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "SubjectType{" +
                "code='" + code + '\'' +
                ", classificationCode='" + classificationCode + '\'' +
                '}';
    }
}
