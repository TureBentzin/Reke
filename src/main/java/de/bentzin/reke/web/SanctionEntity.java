package de.bentzin.reke.web;


import org.jetbrains.annotations.Nullable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Ture Bentzin
 * @since 16-12-2024
 */
@XmlType(name = "sanctionEntity", namespace = "http://eu.europa.ec/fpi/fsd/export")
public class SanctionEntity {

    @Nullable
    private String designationDetails;

    @Nullable
    private String unitedNationId;

    @Nullable
    private String logicalId;

    @Nullable
    private String remark;

    @Nullable
    private Regulation regulation;

    @Nullable
    public String getDesignationDetails() {
        return designationDetails;
    }

    @XmlAttribute(name = "designationDetails")
    public void setDesignationDetails(@Nullable String designationDetails) {
        this.designationDetails = designationDetails;
    }

    @Nullable
    public String getUnitedNationId() {
        return unitedNationId;
    }

    @XmlAttribute(name = "unitedNationId")
    public void setUnitedNationId(@Nullable String unitedNationId) {
        this.unitedNationId = unitedNationId;
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
    public String getRemark() {
        return remark;
    }

    @XmlElement(name = "remark", namespace = "http://eu.europa.ec/fpi/fsd/export")
    public void setRemark(@Nullable String remark) {
        this.remark = remark;
    }

    @Nullable
    public Regulation getRegulation() {
        return regulation;
    }

    @XmlElement(name = "regulation", namespace = "http://eu.europa.ec/fpi/fsd/export")
    public void setRegulation(@Nullable Regulation regulation) {
        this.regulation = regulation;
    }

    @Override
    public String toString() {
        return "SanctionEntity{" +
                "designationDetails='" + designationDetails + '\'' +
                ", unitedNationId='" + unitedNationId + '\'' +
                ", logicalId='" + logicalId + '\'' +
                ", remark='" + remark + '\'' +
                ", regulation=" + regulation +
                '}';
    }
}
