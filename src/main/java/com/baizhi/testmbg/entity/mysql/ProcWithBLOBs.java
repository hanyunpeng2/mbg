package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class ProcWithBLOBs extends Proc implements Serializable {
    private byte[] paramList;

    private byte[] returns;

    private byte[] body;

    private String comment;

    private byte[] bodyUtf8;

    private static final long serialVersionUID = 1L;

    public byte[] getParamList() {
        return paramList;
    }

    public void setParamList(byte[] paramList) {
        this.paramList = paramList;
    }

    public byte[] getReturns() {
        return returns;
    }

    public void setReturns(byte[] returns) {
        this.returns = returns;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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
        ProcWithBLOBs other = (ProcWithBLOBs) that;
        return (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSpecificName() == null ? other.getSpecificName() == null : this.getSpecificName().equals(other.getSpecificName()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getSqlDataAccess() == null ? other.getSqlDataAccess() == null : this.getSqlDataAccess().equals(other.getSqlDataAccess()))
            && (this.getIsDeterministic() == null ? other.getIsDeterministic() == null : this.getIsDeterministic().equals(other.getIsDeterministic()))
            && (this.getSecurityType() == null ? other.getSecurityType() == null : this.getSecurityType().equals(other.getSecurityType()))
            && (this.getDefiner() == null ? other.getDefiner() == null : this.getDefiner().equals(other.getDefiner()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getModified() == null ? other.getModified() == null : this.getModified().equals(other.getModified()))
            && (this.getSqlMode() == null ? other.getSqlMode() == null : this.getSqlMode().equals(other.getSqlMode()))
            && (this.getCharacterSetClient() == null ? other.getCharacterSetClient() == null : this.getCharacterSetClient().equals(other.getCharacterSetClient()))
            && (this.getCollationConnection() == null ? other.getCollationConnection() == null : this.getCollationConnection().equals(other.getCollationConnection()))
            && (this.getDbCollation() == null ? other.getDbCollation() == null : this.getDbCollation().equals(other.getDbCollation()))
            && (this.getParamList() == null ? other.getParamList() == null : this.getParamList().equals(other.getParamList()))
            && (this.getReturns() == null ? other.getReturns() == null : this.getReturns().equals(other.getReturns()))
            && (this.getBody() == null ? other.getBody() == null : this.getBody().equals(other.getBody()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getBodyUtf8() == null ? other.getBodyUtf8() == null : this.getBodyUtf8().equals(other.getBodyUtf8()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSpecificName() == null) ? 0 : getSpecificName().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getSqlDataAccess() == null) ? 0 : getSqlDataAccess().hashCode());
        result = prime * result + ((getIsDeterministic() == null) ? 0 : getIsDeterministic().hashCode());
        result = prime * result + ((getSecurityType() == null) ? 0 : getSecurityType().hashCode());
        result = prime * result + ((getDefiner() == null) ? 0 : getDefiner().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getModified() == null) ? 0 : getModified().hashCode());
        result = prime * result + ((getSqlMode() == null) ? 0 : getSqlMode().hashCode());
        result = prime * result + ((getCharacterSetClient() == null) ? 0 : getCharacterSetClient().hashCode());
        result = prime * result + ((getCollationConnection() == null) ? 0 : getCollationConnection().hashCode());
        result = prime * result + ((getDbCollation() == null) ? 0 : getDbCollation().hashCode());
        result = prime * result + ((getParamList() == null) ? 0 : getParamList().hashCode());
        result = prime * result + ((getReturns() == null) ? 0 : getReturns().hashCode());
        result = prime * result + ((getBody() == null) ? 0 : getBody().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getBodyUtf8() == null) ? 0 : getBodyUtf8().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paramList=").append(paramList);
        sb.append(", returns=").append(returns);
        sb.append(", body=").append(body);
        sb.append(", comment=").append(comment);
        sb.append(", bodyUtf8=").append(bodyUtf8);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}