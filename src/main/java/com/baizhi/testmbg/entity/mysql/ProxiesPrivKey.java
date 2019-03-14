package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class ProxiesPrivKey implements Serializable {
    private String host;

    private String user;

    private String proxiedHost;

    private String proxiedUser;

    private static final long serialVersionUID = 1L;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getProxiedHost() {
        return proxiedHost;
    }

    public void setProxiedHost(String proxiedHost) {
        this.proxiedHost = proxiedHost == null ? null : proxiedHost.trim();
    }

    public String getProxiedUser() {
        return proxiedUser;
    }

    public void setProxiedUser(String proxiedUser) {
        this.proxiedUser = proxiedUser == null ? null : proxiedUser.trim();
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
        ProxiesPrivKey other = (ProxiesPrivKey) that;
        return (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()))
            && (this.getProxiedHost() == null ? other.getProxiedHost() == null : this.getProxiedHost().equals(other.getProxiedHost()))
            && (this.getProxiedUser() == null ? other.getProxiedUser() == null : this.getProxiedUser().equals(other.getProxiedUser()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getProxiedHost() == null) ? 0 : getProxiedHost().hashCode());
        result = prime * result + ((getProxiedUser() == null) ? 0 : getProxiedUser().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", user=").append(user);
        sb.append(", proxiedHost=").append(proxiedHost);
        sb.append(", proxiedUser=").append(proxiedUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}