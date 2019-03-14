package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;
import java.util.Date;

public class TablesPriv extends TablesPrivKey implements Serializable {
    private String grantor;

    private Date timestamp;

    private String tablePriv;

    private String columnPriv;

    private static final long serialVersionUID = 1L;

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

    public String getTablePriv() {
        return tablePriv;
    }

    public void setTablePriv(String tablePriv) {
        this.tablePriv = tablePriv == null ? null : tablePriv.trim();
    }

    public String getColumnPriv() {
        return columnPriv;
    }

    public void setColumnPriv(String columnPriv) {
        this.columnPriv = columnPriv == null ? null : columnPriv.trim();
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
        TablesPriv other = (TablesPriv) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getTableName() == null ? other.getTableName() == null : this.getTableName().equals(other.getTableName()))
            && (this.getGrantor() == null ? other.getGrantor() == null : this.getGrantor().equals(other.getGrantor()))
            && (this.getTimestamp() == null ? other.getTimestamp() == null : this.getTimestamp().equals(other.getTimestamp()))
            && (this.getTablePriv() == null ? other.getTablePriv() == null : this.getTablePriv().equals(other.getTablePriv()))
            && (this.getColumnPriv() == null ? other.getColumnPriv() == null : this.getColumnPriv().equals(other.getColumnPriv()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getTableName() == null) ? 0 : getTableName().hashCode());
        result = prime * result + ((getGrantor() == null) ? 0 : getGrantor().hashCode());
        result = prime * result + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        result = prime * result + ((getTablePriv() == null) ? 0 : getTablePriv().hashCode());
        result = prime * result + ((getColumnPriv() == null) ? 0 : getColumnPriv().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantor=").append(grantor);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", tablePriv=").append(tablePriv);
        sb.append(", columnPriv=").append(columnPriv);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}