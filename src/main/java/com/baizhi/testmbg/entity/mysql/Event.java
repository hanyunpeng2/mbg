package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;
import java.util.Date;

public class Event extends EventKey implements Serializable {
    private String definer;

    private Date executeAt;

    private Integer intervalValue;

    private String intervalField;

    private Date created;

    private Date modified;

    private Date lastExecuted;

    private Date starts;

    private Date ends;

    private String status;

    private String onCompletion;

    private String sqlMode;

    private String comment;

    private Integer originator;

    private String timeZone;

    private String characterSetClient;

    private String collationConnection;

    private String dbCollation;

    private static final long serialVersionUID = 1L;

    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer == null ? null : definer.trim();
    }

    public Date getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Date executeAt) {
        this.executeAt = executeAt;
    }

    public Integer getIntervalValue() {
        return intervalValue;
    }

    public void setIntervalValue(Integer intervalValue) {
        this.intervalValue = intervalValue;
    }

    public String getIntervalField() {
        return intervalField;
    }

    public void setIntervalField(String intervalField) {
        this.intervalField = intervalField == null ? null : intervalField.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getLastExecuted() {
        return lastExecuted;
    }

    public void setLastExecuted(Date lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    public Date getStarts() {
        return starts;
    }

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public Date getEnds() {
        return ends;
    }

    public void setEnds(Date ends) {
        this.ends = ends;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOnCompletion() {
        return onCompletion;
    }

    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion == null ? null : onCompletion.trim();
    }

    public String getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode == null ? null : sqlMode.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getOriginator() {
        return originator;
    }

    public void setOriginator(Integer originator) {
        this.originator = originator;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    public String getCharacterSetClient() {
        return characterSetClient;
    }

    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient == null ? null : characterSetClient.trim();
    }

    public String getCollationConnection() {
        return collationConnection;
    }

    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection == null ? null : collationConnection.trim();
    }

    public String getDbCollation() {
        return dbCollation;
    }

    public void setDbCollation(String dbCollation) {
        this.dbCollation = dbCollation == null ? null : dbCollation.trim();
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
        Event other = (Event) that;
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
            && (this.getDbCollation() == null ? other.getDbCollation() == null : this.getDbCollation().equals(other.getDbCollation()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", definer=").append(definer);
        sb.append(", executeAt=").append(executeAt);
        sb.append(", intervalValue=").append(intervalValue);
        sb.append(", intervalField=").append(intervalField);
        sb.append(", created=").append(created);
        sb.append(", modified=").append(modified);
        sb.append(", lastExecuted=").append(lastExecuted);
        sb.append(", starts=").append(starts);
        sb.append(", ends=").append(ends);
        sb.append(", status=").append(status);
        sb.append(", onCompletion=").append(onCompletion);
        sb.append(", sqlMode=").append(sqlMode);
        sb.append(", comment=").append(comment);
        sb.append(", originator=").append(originator);
        sb.append(", timeZone=").append(timeZone);
        sb.append(", characterSetClient=").append(characterSetClient);
        sb.append(", collationConnection=").append(collationConnection);
        sb.append(", dbCollation=").append(dbCollation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}