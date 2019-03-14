package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;
import java.util.Date;

public class ProxiesPriv extends ProxiesPrivKey implements Serializable {
    private Boolean withGrant;

    private String grantor;

    private Date timestamp;

    private static final long serialVersionUID = 1L;

    public Boolean getWithGrant() {
        return withGrant;
    }

    public void setWithGrant(Boolean withGrant) {
        this.withGrant = withGrant;
    }

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor == null ? null : grantor.trim();
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
        ProxiesPriv other = (ProxiesPriv) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getProxiedHost() == null ? other.getProxiedHost() == null : this.getProxiedHost().equals(other.getProxiedHost()))
            && (this.getProxiedUser() == null ? other.getProxiedUser() == null : this.getProxiedUser().equals(other.getProxiedUser()))
            && (this.getWithGrant() == null ? other.getWithGrant() == null : this.getWithGrant().equals(other.getWithGrant()))
            && (this.getGrantor() == null ? other.getGrantor() == null : this.getGrantor().equals(other.getGrantor()))
            && (this.getTimestamp() == null ? other.getTimestamp() == null : this.getTimestamp().equals(other.getTimestamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getProxiedHost() == null) ? 0 : getProxiedHost().hashCode());
        result = prime * result + ((getProxiedUser() == null) ? 0 : getProxiedUser().hashCode());
        result = prime * result + ((getWithGrant() == null) ? 0 : getWithGrant().hashCode());
        result = prime * result + ((getGrantor() == null) ? 0 : getGrantor().hashCode());
        result = prime * result + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", withGrant=").append(withGrant);
        sb.append(", grantor=").append(grantor);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}