package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class TimeZoneTransition extends TimeZoneTransitionKey implements Serializable {
    private Integer transitionTypeId;

    private static final long serialVersionUID = 1L;

    public Integer getTransitionTypeId() {
        return transitionTypeId;
    }

    public void setTransitionTypeId(Integer transitionTypeId) {
        this.transitionTypeId = transitionTypeId;
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
        TimeZoneTransition other = (TimeZoneTransition) that;
        return (this.getTimeZoneId() == null ? other.getTimeZoneId() == null : this.getTimeZoneId().equals(other.getTimeZoneId()))
            && (this.getTransitionTime() == null ? other.getTransitionTime() == null : this.getTransitionTime().equals(other.getTransitionTime()))
            && (this.getTransitionTypeId() == null ? other.getTransitionTypeId() == null : this.getTransitionTypeId().equals(other.getTransitionTypeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        result = prime * result + ((getTransitionTime() == null) ? 0 : getTransitionTime().hashCode());
        result = prime * result + ((getTransitionTypeId() == null) ? 0 : getTransitionTypeId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transitionTypeId=").append(transitionTypeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}