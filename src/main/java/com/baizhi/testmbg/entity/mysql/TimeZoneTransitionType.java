package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class TimeZoneTransitionType extends TimeZoneTransitionTypeKey implements Serializable {
    private Integer offset;

    private Byte isDst;

    private String abbreviation;

    private static final long serialVersionUID = 1L;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Byte getIsDst() {
        return isDst;
    }

    public void setIsDst(Byte isDst) {
        this.isDst = isDst;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TimeZoneTransitionType other = (TimeZoneTransitionType) that;
        return (this.getTimeZoneId() == null ? other.getTimeZoneId() == null : this.getTimeZoneId().equals(other.getTimeZoneId()))
            && (this.getTransitionTypeId() == null ? other.getTransitionTypeId() == null : this.getTransitionTypeId().equals(other.getTransitionTypeId()))
            && (this.getOffset() == null ? other.getOffset() == null : this.getOffset().equals(other.getOffset()))
            && (this.getIsDst() == null ? other.getIsDst() == null : this.getIsDst().equals(other.getIsDst()))
            && (this.getAbbreviation() == null ? other.getAbbreviation() == null : this.getAbbreviation().equals(other.getAbbreviation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        result = prime * result + ((getTransitionTypeId() == null) ? 0 : getTransitionTypeId().hashCode());
        result = prime * result + ((getOffset() == null) ? 0 : getOffset().hashCode());
        result = prime * result + ((getIsDst() == null) ? 0 : getIsDst().hashCode());
        result = prime * result + ((getAbbreviation() == null) ? 0 : getAbbreviation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", offset=").append(offset);
        sb.append(", isDst=").append(isDst);
        sb.append(", abbreviation=").append(abbreviation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}