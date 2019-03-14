package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;
import java.util.Date;

public class Proc extends ProcKey implements Serializable {
    private String specificName;

    private String language;

    private String sqlDataAccess;

    private String isDeterministic;

    private String securityType;

    private String definer;

    private Date created;

    private Date modified;

    private String sqlMode;

    private String characterSetClient;

    private String collationConnection;

    private String dbCollation;

    private static final long serialVersionUID = 1L;

    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName == null ? null : specificName.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getSqlDataAccess() {
        return sqlDataAccess;
    }

    public void setSqlDataAccess(String sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess == null ? null : sqlDataAccess.trim();
    }

    public String getIsDeterministic() {
        return isDeterministic;
    }

    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic == null ? null : isDeterministic.trim();
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType == null ? null : securityType.trim();
    }

    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer == null ? null : definer.trim();
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

    public String getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode == null ? null : sqlMode.trim();
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
        Proc other = (Proc) that;
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
            && (this.getDbCollation() == null ? other.getDbCollation() == null : this.getDbCollation().equals(other.getDbCollation()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", specificName=").append(specificName);
        sb.append(", language=").append(language);
        sb.append(", sqlDataAccess=").append(sqlDataAccess);
        sb.append(", isDeterministic=").append(isDeterministic);
        sb.append(", securityType=").append(securityType);
        sb.append(", definer=").append(definer);
        sb.append(", created=").append(created);
        sb.append(", modified=").append(modified);
        sb.append(", sqlMode=").append(sqlMode);
        sb.append(", characterSetClient=").append(characterSetClient);
        sb.append(", collationConnection=").append(collationConnection);
        sb.append(", dbCollation=").append(dbCollation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}