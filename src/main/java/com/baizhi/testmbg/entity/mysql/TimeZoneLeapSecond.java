package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class TimeZoneLeapSecond implements Serializable {
    private Long transitionTime;

    private Integer correction;

    private static final long serialVersionUID = 1L;

    public Long getTransitionTime() {
        return transitionTime;
    }

    public void setTransitionTime(Long transitionTime) {
        this.transitionTime = transitionTime;
    }

    public Integer getCorrection() {
        return correction;
    }

    public void setCorrection(Integer correction) {
        this.correction = correction;
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
        TimeZoneLeapSecond other = (TimeZoneLeapSecond) that;
        return (this.getTransitionTime() == null ? other.getTransitionTime() == null : this.getTransitionTime().equals(other.getTransitionTime()))
            && (this.getCorrection() == null ? other.getCorrection() == null : this.getCorrection().equals(other.getCorrection()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransitionTime() == null) ? 0 : getTransitionTime().hashCode());
        result = prime * result + ((getCorrection() == null) ? 0 : getCorrection().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transitionTime=").append(transitionTime);
        sb.append(", correction=").append(correction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}