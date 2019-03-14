package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;
import java.util.Date;

public class ProcsPriv extends ProcsPrivKey implements Serializable {
    private String grantor;

    private String procPriv;

    private Date timestamp;

    private static final long serialVersionUID = 1L;

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor == null ? null : grantor.trim();
    }

    public String getProcPriv() {
        return procPriv;
    }

    public void setProcPriv(String procPriv) {
        this.procPriv = procPriv == null ? null : procPriv.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
        ProcsPriv other = (ProcsPriv) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getRoutineName() == null ? other.getRoutineName() == null : this.getRoutineName().equals(other.getRoutineName()))
            && (this.getRoutineType() == null ? other.getRoutineType() == null : this.getRoutineType().equals(other.getRoutineType()))
            && (this.getGrantor() == null ? other.getGrantor() == null : this.getGrantor().equals(other.getGrantor()))
            && (this.getProcPriv() == null ? other.getProcPriv() == null : this.getProcPriv().equals(other.getProcPriv()))
            && (this.getTimestamp() == null ? other.getTimestamp() == null : this.getTimestamp().equals(other.getTimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getRoutineName() == null) ? 0 : getRoutineName().hashCode());
        result = prime * result + ((getRoutineType() == null) ? 0 : getRoutineType().hashCode());
        result = prime * result + ((getGrantor() == null) ? 0 : getGrantor().hashCode());
        result = prime * result + ((getProcPriv() == null) ? 0 : getProcPriv().hashCode());
        result = prime * result + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantor=").append(grantor);
        sb.append(", procPriv=").append(procPriv);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}