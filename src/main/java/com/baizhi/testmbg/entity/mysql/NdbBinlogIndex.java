package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class NdbBinlogIndex implements Serializable {
    private Long epoch;

    private Long position;

    private String file;

    private Long inserts;

    private Long updates;

    private Long deletes;

    private Long schemaops;

    private static final long serialVersionUID = 1L;

    public Long getEpoch() {
        return epoch;
    }

    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Long getInserts() {
        return inserts;
    }

    public void setInserts(Long inserts) {
        this.inserts = inserts;
    }

    public Long getUpdates() {
        return updates;
    }

    public void setUpdates(Long updates) {
        this.updates = updates;
    }

    public Long getDeletes() {
        return deletes;
    }

    public void setDeletes(Long deletes) {
        this.deletes = deletes;
    }

    public Long getSchemaops() {
        return schemaops;
    }

    public void setSchemaops(Long schemaops) {
        this.schemaops = schemaops;
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
        NdbBinlogIndex other = (NdbBinlogIndex) that;
        return (this.getEpoch() == null ? other.getEpoch() == null : this.getEpoch().equals(other.getEpoch()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getFile() == null ? other.getFile() == null : this.getFile().equals(other.getFile()))
            && (this.getInserts() == null ? other.getInserts() == null : this.getInserts().equals(other.getInserts()))
            && (this.getUpdates() == null ? other.getUpdates() == null : this.getUpdates().equals(other.getUpdates()))
            && (this.getDeletes() == null ? other.getDeletes() == null : this.getDeletes().equals(other.getDeletes()))
            && (this.getSchemaops() == null ? other.getSchemaops() == null : this.getSchemaops().equals(other.getSchemaops()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEpoch() == null) ? 0 : getEpoch().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getFile() == null) ? 0 : getFile().hashCode());
        result = prime * result + ((getInserts() == null) ? 0 : getInserts().hashCode());
        result = prime * result + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        result = prime * result + ((getDeletes() == null) ? 0 : getDeletes().hashCode());
        result = prime * result + ((getSchemaops() == null) ? 0 : getSchemaops().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", epoch=").append(epoch);
        sb.append(", position=").append(position);
        sb.append(", file=").append(file);
        sb.append(", inserts=").append(inserts);
        sb.append(", updates=").append(updates);
        sb.append(", deletes=").append(deletes);
        sb.append(", schemaops=").append(schemaops);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}