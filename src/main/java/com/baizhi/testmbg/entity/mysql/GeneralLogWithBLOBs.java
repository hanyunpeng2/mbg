package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class GeneralLogWithBLOBs extends GeneralLog implements Serializable {
    private String userHost;

    private String argument;

    private static final long serialVersionUID = 1L;

    public String getUserHost() {
        return userHost;
    }

    public void setUserHost(String userHost) {
        this.userHost = userHost == null ? null : userHost.trim();
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument == null ? null : argument.trim();
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
        GeneralLogWithBLOBs other = (GeneralLogWithBLOBs) that;
        return (this.getEventTime() == null ? other.getEventTime() == null : this.getEventTime().equals(other.getEventTime()))
            && (this.getThreadId() == null ? other.getThreadId() == null : this.getThreadId().equals(other.getThreadId()))
            && (this.getServerId() == null ? other.getServerId() == null : this.getServerId().equals(other.getServerId()))
            && (this.getCommandType() == null ? other.getCommandType() == null : this.getCommandType().equals(other.getCommandType()))
            && (this.getUserHost() == null ? other.getUserHost() == null : this.getUserHost().equals(other.getUserHost()))
            && (this.getArgument() == null ? other.getArgument() == null : this.getArgument().equals(other.getArgument()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        result = prime * result + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        result = prime * result + ((getServerId() == null) ? 0 : getServerId().hashCode());
        result = prime * result + ((getCommandType() == null) ? 0 : getCommandType().hashCode());
        result = prime * result + ((getUserHost() == null) ? 0 : getUserHost().hashCode());
        result = prime * result + ((getArgument() == null) ? 0 : getArgument().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userHost=").append(userHost);
        sb.append(", argument=").append(argument);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}