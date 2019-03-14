package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class SlowLogWithBLOBs extends SlowLog implements Serializable {
    private String userHost;

    private String sqlText;

    private static final long serialVersionUID = 1L;

    public String getUserHost() {
        return userHost;
    }

    public void setUserHost(String userHost) {
        this.userHost = userHost == null ? null : userHost.trim();
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText == null ? null : sqlText.trim();
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
        SlowLogWithBLOBs other = (SlowLogWithBLOBs) that;
        return (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getQueryTime() == null ? other.getQueryTime() == null : this.getQueryTime().equals(other.getQueryTime()))
            && (this.getLockTime() == null ? other.getLockTime() == null : this.getLockTime().equals(other.getLockTime()))
            && (this.getRowsSent() == null ? other.getRowsSent() == null : this.getRowsSent().equals(other.getRowsSent()))
            && (this.getRowsExamined() == null ? other.getRowsExamined() == null : this.getRowsExamined().equals(other.getRowsExamined()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getLastInsertId() == null ? other.getLastInsertId() == null : this.getLastInsertId().equals(other.getLastInsertId()))
            && (this.getInsertId() == null ? other.getInsertId() == null : this.getInsertId().equals(other.getInsertId()))
            && (this.getServerId() == null ? other.getServerId() == null : this.getServerId().equals(other.getServerId()))
            && (this.getUserHost() == null ? other.getUserHost() == null : this.getUserHost().equals(other.getUserHost()))
            && (this.getSqlText() == null ? other.getSqlText() == null : this.getSqlText().equals(other.getSqlText()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getQueryTime() == null) ? 0 : getQueryTime().hashCode());
        result = prime * result + ((getLockTime() == null) ? 0 : getLockTime().hashCode());
        result = prime * result + ((getRowsSent() == null) ? 0 : getRowsSent().hashCode());
        result = prime * result + ((getRowsExamined() == null) ? 0 : getRowsExamined().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getLastInsertId() == null) ? 0 : getLastInsertId().hashCode());
        result = prime * result + ((getInsertId() == null) ? 0 : getInsertId().hashCode());
        result = prime * result + ((getServerId() == null) ? 0 : getServerId().hashCode());
        result = prime * result + ((getUserHost() == null) ? 0 : getUserHost().hashCode());
        result = prime * result + ((getSqlText() == null) ? 0 : getSqlText().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userHost=").append(userHost);
        sb.append(", sqlText=").append(sqlText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}