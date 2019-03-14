package com.baizhi.entity;

import java.io.Serializable;

public class eventWithBLOBs extends event implements Serializable {
    private byte[] body;

    private byte[] bodyUtf8;

    private static final long serialVersionUID = 1L;

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public byte[] getBodyUtf8() {
        return bodyUtf8;
    }

    public void setBodyUtf8(byte[] bodyUtf8) {
        this.bodyUtf8 = bodyUtf8;
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
        eventWithBLOBs other = (eventWithBLOBs) that;
        return (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDefiner() == null ? other.getDefiner() == null : this.getDefiner().equals(other.getDefiner()))
            && (this.getExecuteAt() == null ? other.getExecuteAt() == null : this.getExecuteAt().equals(other.getExecuteAt()))
            && (this.getIntervalValue() == null ? other.getIntervalValue() == null : this.getIntervalValue().equals(other.getIntervalValue()))
            && (this.getIntervalField() == null ? other.getIntervalField() == null : this.getIntervalField().equals(other.getIntervalField()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getModified() == null ? other.getModified() == null : this.getModified().equals(other.getModified()))
            && (this.getLastExecuted() == null ? other.getLastExecuted() == null : this.getLastExecuted().equals(other.getLastExecuted()))
            && (this.getStarts() == null ? other.getStarts() == null : this.getStarts().equals(other.getStarts()))
            && (this.getEnds() == null ? other.getEnds() == null : this.getEnds().equals(other.getEnds()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOnCompletion() == null ? other.getOnCompletion() == null : this.getOnCompletion().equals(other.getOnCompletion()))
            && (this.getSqlMode() == null ? other.getSqlMode() == null : this.getSqlMode().equals(other.getSqlMode()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getOriginator() == null ? other.getOriginator() == null : this.getOriginator().equals(other.getOriginator()))
            && (this.getTimeZone() == null ? other.getTimeZone() == null : this.getTimeZone().equals(other.getTimeZone()))
            && (this.getCharacterSetClient() == null ? other.getCharacterSetClient() == null : this.getCharacterSetClient().equals(other.getCharacterSetClient()))
            && (this.getCollationConnection() == null ? other.getCollationConnection() == null : this.getCollationConnection().equals(other.getCollationConnection()))
            && (this.getDbCollation() == null ? other.getDbCollation() == null : this.getDbCollation().equals(other.getDbCollation()))
            && (this.getBody() == null ? other.getBody() == null : this.getBody().equals(other.getBody()))
            && (this.getBodyUtf8() == null ? other.getBodyUtf8() == null : this.getBodyUtf8().equals(other.getBodyUtf8()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDefiner() == null) ? 0 : getDefiner().hashCode());
        result = prime * result + ((getExecuteAt() == null) ? 0 : getExecuteAt().hashCode());
        result = prime * result + ((getIntervalValue() == null) ? 0 : getIntervalValue().hashCode());
        result = prime * result + ((getIntervalField() == null) ? 0 : getIntervalField().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getModified() == null) ? 0 : getModified().hashCode());
        result = prime * result + ((getLastExecuted() == null) ? 0 : getLastExecuted().hashCode());
        result = prime * result + ((getStarts() == null) ? 0 : getStarts().hashCode());
        result = prime * result + ((getEnds() == null) ? 0 : getEnds().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOnCompletion() == null) ? 0 : getOnCompletion().hashCode());
        result = prime * result + ((getSqlMode() == null) ? 0 : getSqlMode().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getOriginator() == null) ? 0 : getOriginator().hashCode());
        result = prime * result + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        result = prime * result + ((getCharacterSetClient() == null) ? 0 : getCharacterSetClient().hashCode());
        result = prime * result + ((getCollationConnection() == null) ? 0 : getCollationConnection().hashCode());
        result = prime * result + ((getDbCollation() == null) ? 0 : getDbCollation().hashCode());
        result = prime * result + ((getBody() == null) ? 0 : getBody().hashCode());
        result = prime * result + ((getBodyUtf8() == null) ? 0 : getBodyUtf8().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", body=").append(body);
        sb.append(", bodyUtf8=").append(bodyUtf8);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}