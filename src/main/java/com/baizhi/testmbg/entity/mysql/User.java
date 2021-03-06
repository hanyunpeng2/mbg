package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class User extends UserKey implements Serializable {
    private String password;

    private String selectPriv;

    private String insertPriv;

    private String updatePriv;

    private String deletePriv;

    private String createPriv;

    private String dropPriv;

    private String reloadPriv;

    private String shutdownPriv;

    private String processPriv;

    private String filePriv;

    private String grantPriv;

    private String referencesPriv;

    private String indexPriv;

    private String alterPriv;

    private String showDbPriv;

    private String superPriv;

    private String createTmpTablePriv;

    private String lockTablesPriv;

    private String executePriv;

    private String replSlavePriv;

    private String replClientPriv;

    private String createViewPriv;

    private String showViewPriv;

    private String createRoutinePriv;

    private String alterRoutinePriv;

    private String createUserPriv;

    private String eventPriv;

    private String triggerPriv;

    private String createTablespacePriv;

    private String sslType;

    private Integer maxQuestions;

    private Integer maxUpdates;

    private Integer maxConnections;

    private Integer maxUserConnections;

    private String plugin;

    private static final long serialVersionUID = 1L;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSelectPriv() {
        return selectPriv;
    }

    public void setSelectPriv(String selectPriv) {
        this.selectPriv = selectPriv == null ? null : selectPriv.trim();
    }

    public String getInsertPriv() {
        return insertPriv;
    }

    public void setInsertPriv(String insertPriv) {
        this.insertPriv = insertPriv == null ? null : insertPriv.trim();
    }

    public String getUpdatePriv() {
        return updatePriv;
    }

    public void setUpdatePriv(String updatePriv) {
        this.updatePriv = updatePriv == null ? null : updatePriv.trim();
    }

    public String getDeletePriv() {
        return deletePriv;
    }

    public void setDeletePriv(String deletePriv) {
        this.deletePriv = deletePriv == null ? null : deletePriv.trim();
    }

    public String getCreatePriv() {
        return createPriv;
    }

    public void setCreatePriv(String createPriv) {
        this.createPriv = createPriv == null ? null : createPriv.trim();
    }

    public String getDropPriv() {
        return dropPriv;
    }

    public void setDropPriv(String dropPriv) {
        this.dropPriv = dropPriv == null ? null : dropPriv.trim();
    }

    public String getReloadPriv() {
        return reloadPriv;
    }

    public void setReloadPriv(String reloadPriv) {
        this.reloadPriv = reloadPriv == null ? null : reloadPriv.trim();
    }

    public String getShutdownPriv() {
        return shutdownPriv;
    }

    public void setShutdownPriv(String shutdownPriv) {
        this.shutdownPriv = shutdownPriv == null ? null : shutdownPriv.trim();
    }

    public String getProcessPriv() {
        return processPriv;
    }

    public void setProcessPriv(String processPriv) {
        this.processPriv = processPriv == null ? null : processPriv.trim();
    }

    public String getFilePriv() {
        return filePriv;
    }

    public void setFilePriv(String filePriv) {
        this.filePriv = filePriv == null ? null : filePriv.trim();
    }

    public String getGrantPriv() {
        return grantPriv;
    }

    public void setGrantPriv(String grantPriv) {
        this.grantPriv = grantPriv == null ? null : grantPriv.trim();
    }

    public String getReferencesPriv() {
        return referencesPriv;
    }

    public void setReferencesPriv(String referencesPriv) {
        this.referencesPriv = referencesPriv == null ? null : referencesPriv.trim();
    }

    public String getIndexPriv() {
        return indexPriv;
    }

    public void setIndexPriv(String indexPriv) {
        this.indexPriv = indexPriv == null ? null : indexPriv.trim();
    }

    public String getAlterPriv() {
        return alterPriv;
    }

    public void setAlterPriv(String alterPriv) {
        this.alterPriv = alterPriv == null ? null : alterPriv.trim();
    }

    public String getShowDbPriv() {
        return showDbPriv;
    }

    public void setShowDbPriv(String showDbPriv) {
        this.showDbPriv = showDbPriv == null ? null : showDbPriv.trim();
    }

    public String getSuperPriv() {
        return superPriv;
    }

    public void setSuperPriv(String superPriv) {
        this.superPriv = superPriv == null ? null : superPriv.trim();
    }

    public String getCreateTmpTablePriv() {
        return createTmpTablePriv;
    }

    public void setCreateTmpTablePriv(String createTmpTablePriv) {
        this.createTmpTablePriv = createTmpTablePriv == null ? null : createTmpTablePriv.trim();
    }

    public String getLockTablesPriv() {
        return lockTablesPriv;
    }

    public void setLockTablesPriv(String lockTablesPriv) {
        this.lockTablesPriv = lockTablesPriv == null ? null : lockTablesPriv.trim();
    }

    public String getExecutePriv() {
        return executePriv;
    }

    public void setExecutePriv(String executePriv) {
        this.executePriv = executePriv == null ? null : executePriv.trim();
    }

    public String getReplSlavePriv() {
        return replSlavePriv;
    }

    public void setReplSlavePriv(String replSlavePriv) {
        this.replSlavePriv = replSlavePriv == null ? null : replSlavePriv.trim();
    }

    public String getReplClientPriv() {
        return replClientPriv;
    }

    public void setReplClientPriv(String replClientPriv) {
        this.replClientPriv = replClientPriv == null ? null : replClientPriv.trim();
    }

    public String getCreateViewPriv() {
        return createViewPriv;
    }

    public void setCreateViewPriv(String createViewPriv) {
        this.createViewPriv = createViewPriv == null ? null : createViewPriv.trim();
    }

    public String getShowViewPriv() {
        return showViewPriv;
    }

    public void setShowViewPriv(String showViewPriv) {
        this.showViewPriv = showViewPriv == null ? null : showViewPriv.trim();
    }

    public String getCreateRoutinePriv() {
        return createRoutinePriv;
    }

    public void setCreateRoutinePriv(String createRoutinePriv) {
        this.createRoutinePriv = createRoutinePriv == null ? null : createRoutinePriv.trim();
    }

    public String getAlterRoutinePriv() {
        return alterRoutinePriv;
    }

    public void setAlterRoutinePriv(String alterRoutinePriv) {
        this.alterRoutinePriv = alterRoutinePriv == null ? null : alterRoutinePriv.trim();
    }

    public String getCreateUserPriv() {
        return createUserPriv;
    }

    public void setCreateUserPriv(String createUserPriv) {
        this.createUserPriv = createUserPriv == null ? null : createUserPriv.trim();
    }

    public String getEventPriv() {
        return eventPriv;
    }

    public void setEventPriv(String eventPriv) {
        this.eventPriv = eventPriv == null ? null : eventPriv.trim();
    }

    public String getTriggerPriv() {
        return triggerPriv;
    }

    public void setTriggerPriv(String triggerPriv) {
        this.triggerPriv = triggerPriv == null ? null : triggerPriv.trim();
    }

    public String getCreateTablespacePriv() {
        return createTablespacePriv;
    }

    public void setCreateTablespacePriv(String createTablespacePriv) {
        this.createTablespacePriv = createTablespacePriv == null ? null : createTablespacePriv.trim();
    }

    public String getSslType() {
        return sslType;
    }

    public void setSslType(String sslType) {
        this.sslType = sslType == null ? null : sslType.trim();
    }

    public Integer getMaxQuestions() {
        return maxQuestions;
    }

    public void setMaxQuestions(Integer maxQuestions) {
        this.maxQuestions = maxQuestions;
    }

    public Integer getMaxUpdates() {
        return maxUpdates;
    }

    public void setMaxUpdates(Integer maxUpdates) {
        this.maxUpdates = maxUpdates;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    public Integer getMaxUserConnections() {
        return maxUserConnections;
    }

    public void setMaxUserConnections(Integer maxUserConnections) {
        this.maxUserConnections = maxUserConnections;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin == null ? null : plugin.trim();
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
        User other = (User) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSelectPriv() == null ? other.getSelectPriv() == null : this.getSelectPriv().equals(other.getSelectPriv()))
            && (this.getInsertPriv() == null ? other.getInsertPriv() == null : this.getInsertPriv().equals(other.getInsertPriv()))
            && (this.getUpdatePriv() == null ? other.getUpdatePriv() == null : this.getUpdatePriv().equals(other.getUpdatePriv()))
            && (this.getDeletePriv() == null ? other.getDeletePriv() == null : this.getDeletePriv().equals(other.getDeletePriv()))
            && (this.getCreatePriv() == null ? other.getCreatePriv() == null : this.getCreatePriv().equals(other.getCreatePriv()))
            && (this.getDropPriv() == null ? other.getDropPriv() == null : this.getDropPriv().equals(other.getDropPriv()))
            && (this.getReloadPriv() == null ? other.getReloadPriv() == null : this.getReloadPriv().equals(other.getReloadPriv()))
            && (this.getShutdownPriv() == null ? other.getShutdownPriv() == null : this.getShutdownPriv().equals(other.getShutdownPriv()))
            && (this.getProcessPriv() == null ? other.getProcessPriv() == null : this.getProcessPriv().equals(other.getProcessPriv()))
            && (this.getFilePriv() == null ? other.getFilePriv() == null : this.getFilePriv().equals(other.getFilePriv()))
            && (this.getGrantPriv() == null ? other.getGrantPriv() == null : this.getGrantPriv().equals(other.getGrantPriv()))
            && (this.getReferencesPriv() == null ? other.getReferencesPriv() == null : this.getReferencesPriv().equals(other.getReferencesPriv()))
            && (this.getIndexPriv() == null ? other.getIndexPriv() == null : this.getIndexPriv().equals(other.getIndexPriv()))
            && (this.getAlterPriv() == null ? other.getAlterPriv() == null : this.getAlterPriv().equals(other.getAlterPriv()))
            && (this.getShowDbPriv() == null ? other.getShowDbPriv() == null : this.getShowDbPriv().equals(other.getShowDbPriv()))
            && (this.getSuperPriv() == null ? other.getSuperPriv() == null : this.getSuperPriv().equals(other.getSuperPriv()))
            && (this.getCreateTmpTablePriv() == null ? other.getCreateTmpTablePriv() == null : this.getCreateTmpTablePriv().equals(other.getCreateTmpTablePriv()))
            && (this.getLockTablesPriv() == null ? other.getLockTablesPriv() == null : this.getLockTablesPriv().equals(other.getLockTablesPriv()))
            && (this.getExecutePriv() == null ? other.getExecutePriv() == null : this.getExecutePriv().equals(other.getExecutePriv()))
            && (this.getReplSlavePriv() == null ? other.getReplSlavePriv() == null : this.getReplSlavePriv().equals(other.getReplSlavePriv()))
            && (this.getReplClientPriv() == null ? other.getReplClientPriv() == null : this.getReplClientPriv().equals(other.getReplClientPriv()))
            && (this.getCreateViewPriv() == null ? other.getCreateViewPriv() == null : this.getCreateViewPriv().equals(other.getCreateViewPriv()))
            && (this.getShowViewPriv() == null ? other.getShowViewPriv() == null : this.getShowViewPriv().equals(other.getShowViewPriv()))
            && (this.getCreateRoutinePriv() == null ? other.getCreateRoutinePriv() == null : this.getCreateRoutinePriv().equals(other.getCreateRoutinePriv()))
            && (this.getAlterRoutinePriv() == null ? other.getAlterRoutinePriv() == null : this.getAlterRoutinePriv().equals(other.getAlterRoutinePriv()))
            && (this.getCreateUserPriv() == null ? other.getCreateUserPriv() == null : this.getCreateUserPriv().equals(other.getCreateUserPriv()))
            && (this.getEventPriv() == null ? other.getEventPriv() == null : this.getEventPriv().equals(other.getEventPriv()))
            && (this.getTriggerPriv() == null ? other.getTriggerPriv() == null : this.getTriggerPriv().equals(other.getTriggerPriv()))
            && (this.getCreateTablespacePriv() == null ? other.getCreateTablespacePriv() == null : this.getCreateTablespacePriv().equals(other.getCreateTablespacePriv()))
            && (this.getSslType() == null ? other.getSslType() == null : this.getSslType().equals(other.getSslType()))
            && (this.getMaxQuestions() == null ? other.getMaxQuestions() == null : this.getMaxQuestions().equals(other.getMaxQuestions()))
            && (this.getMaxUpdates() == null ? other.getMaxUpdates() == null : this.getMaxUpdates().equals(other.getMaxUpdates()))
            && (this.getMaxConnections() == null ? other.getMaxConnections() == null : this.getMaxConnections().equals(other.getMaxConnections()))
            && (this.getMaxUserConnections() == null ? other.getMaxUserConnections() == null : this.getMaxUserConnections().equals(other.getMaxUserConnections()))
            && (this.getPlugin() == null ? other.getPlugin() == null : this.getPlugin().equals(other.getPlugin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSelectPriv() == null) ? 0 : getSelectPriv().hashCode());
        result = prime * result + ((getInsertPriv() == null) ? 0 : getInsertPriv().hashCode());
        result = prime * result + ((getUpdatePriv() == null) ? 0 : getUpdatePriv().hashCode());
        result = prime * result + ((getDeletePriv() == null) ? 0 : getDeletePriv().hashCode());
        result = prime * result + ((getCreatePriv() == null) ? 0 : getCreatePriv().hashCode());
        result = prime * result + ((getDropPriv() == null) ? 0 : getDropPriv().hashCode());
        result = prime * result + ((getReloadPriv() == null) ? 0 : getReloadPriv().hashCode());
        result = prime * result + ((getShutdownPriv() == null) ? 0 : getShutdownPriv().hashCode());
        result = prime * result + ((getProcessPriv() == null) ? 0 : getProcessPriv().hashCode());
        result = prime * result + ((getFilePriv() == null) ? 0 : getFilePriv().hashCode());
        result = prime * result + ((getGrantPriv() == null) ? 0 : getGrantPriv().hashCode());
        result = prime * result + ((getReferencesPriv() == null) ? 0 : getReferencesPriv().hashCode());
        result = prime * result + ((getIndexPriv() == null) ? 0 : getIndexPriv().hashCode());
        result = prime * result + ((getAlterPriv() == null) ? 0 : getAlterPriv().hashCode());
        result = prime * result + ((getShowDbPriv() == null) ? 0 : getShowDbPriv().hashCode());
        result = prime * result + ((getSuperPriv() == null) ? 0 : getSuperPriv().hashCode());
        result = prime * result + ((getCreateTmpTablePriv() == null) ? 0 : getCreateTmpTablePriv().hashCode());
        result = prime * result + ((getLockTablesPriv() == null) ? 0 : getLockTablesPriv().hashCode());
        result = prime * result + ((getExecutePriv() == null) ? 0 : getExecutePriv().hashCode());
        result = prime * result + ((getReplSlavePriv() == null) ? 0 : getReplSlavePriv().hashCode());
        result = prime * result + ((getReplClientPriv() == null) ? 0 : getReplClientPriv().hashCode());
        result = prime * result + ((getCreateViewPriv() == null) ? 0 : getCreateViewPriv().hashCode());
        result = prime * result + ((getShowViewPriv() == null) ? 0 : getShowViewPriv().hashCode());
        result = prime * result + ((getCreateRoutinePriv() == null) ? 0 : getCreateRoutinePriv().hashCode());
        result = prime * result + ((getAlterRoutinePriv() == null) ? 0 : getAlterRoutinePriv().hashCode());
        result = prime * result + ((getCreateUserPriv() == null) ? 0 : getCreateUserPriv().hashCode());
        result = prime * result + ((getEventPriv() == null) ? 0 : getEventPriv().hashCode());
        result = prime * result + ((getTriggerPriv() == null) ? 0 : getTriggerPriv().hashCode());
        result = prime * result + ((getCreateTablespacePriv() == null) ? 0 : getCreateTablespacePriv().hashCode());
        result = prime * result + ((getSslType() == null) ? 0 : getSslType().hashCode());
        result = prime * result + ((getMaxQuestions() == null) ? 0 : getMaxQuestions().hashCode());
        result = prime * result + ((getMaxUpdates() == null) ? 0 : getMaxUpdates().hashCode());
        result = prime * result + ((getMaxConnections() == null) ? 0 : getMaxConnections().hashCode());
        result = prime * result + ((getMaxUserConnections() == null) ? 0 : getMaxUserConnections().hashCode());
        result = prime * result + ((getPlugin() == null) ? 0 : getPlugin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", password=").append(password);
        sb.append(", selectPriv=").append(selectPriv);
        sb.append(", insertPriv=").append(insertPriv);
        sb.append(", updatePriv=").append(updatePriv);
        sb.append(", deletePriv=").append(deletePriv);
        sb.append(", createPriv=").append(createPriv);
        sb.append(", dropPriv=").append(dropPriv);
        sb.append(", reloadPriv=").append(reloadPriv);
        sb.append(", shutdownPriv=").append(shutdownPriv);
        sb.append(", processPriv=").append(processPriv);
        sb.append(", filePriv=").append(filePriv);
        sb.append(", grantPriv=").append(grantPriv);
        sb.append(", referencesPriv=").append(referencesPriv);
        sb.append(", indexPriv=").append(indexPriv);
        sb.append(", alterPriv=").append(alterPriv);
        sb.append(", showDbPriv=").append(showDbPriv);
        sb.append(", superPriv=").append(superPriv);
        sb.append(", createTmpTablePriv=").append(createTmpTablePriv);
        sb.append(", lockTablesPriv=").append(lockTablesPriv);
        sb.append(", executePriv=").append(executePriv);
        sb.append(", replSlavePriv=").append(replSlavePriv);
        sb.append(", replClientPriv=").append(replClientPriv);
        sb.append(", createViewPriv=").append(createViewPriv);
        sb.append(", showViewPriv=").append(showViewPriv);
        sb.append(", createRoutinePriv=").append(createRoutinePriv);
        sb.append(", alterRoutinePriv=").append(alterRoutinePriv);
        sb.append(", createUserPriv=").append(createUserPriv);
        sb.append(", eventPriv=").append(eventPriv);
        sb.append(", triggerPriv=").append(triggerPriv);
        sb.append(", createTablespacePriv=").append(createTablespacePriv);
        sb.append(", sslType=").append(sslType);
        sb.append(", maxQuestions=").append(maxQuestions);
        sb.append(", maxUpdates=").append(maxUpdates);
        sb.append(", maxConnections=").append(maxConnections);
        sb.append(", maxUserConnections=").append(maxUserConnections);
        sb.append(", plugin=").append(plugin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}