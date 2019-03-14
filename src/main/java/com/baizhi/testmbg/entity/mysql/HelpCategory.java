package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class HelpCategory implements Serializable {
    private Short helpCategoryId;

    private String name;

    private Short parentCategoryId;

    private String url;

    private static final long serialVersionUID = 1L;

    public Short getHelpCategoryId() {
        return helpCategoryId;
    }

    public void setHelpCategoryId(Short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Short parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        HelpCategory other = (HelpCategory) that;
        return (this.getHelpCategoryId() == null ? other.getHelpCategoryId() == null : this.getHelpCategoryId().equals(other.getHelpCategoryId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentCategoryId() == null ? other.getParentCategoryId() == null : this.getParentCategoryId().equals(other.getParentCategoryId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHelpCategoryId() == null) ? 0 : getHelpCategoryId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentCategoryId() == null) ? 0 : getParentCategoryId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", helpCategoryId=").append(helpCategoryId);
        sb.append(", name=").append(name);
        sb.append(", parentCategoryId=").append(parentCategoryId);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}