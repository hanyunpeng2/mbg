package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class HelpTopic implements Serializable {
    private Integer helpTopicId;

    private String name;

    private Short helpCategoryId;

    private static final long serialVersionUID = 1L;

    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getHelpCategoryId() {
        return helpCategoryId;
    }

    public void setHelpCategoryId(Short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
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
        HelpTopic other = (HelpTopic) that;
        return (this.getHelpTopicId() == null ? other.getHelpTopicId() == null : this.getHelpTopicId().equals(other.getHelpTopicId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getHelpCategoryId() == null ? other.getHelpCategoryId() == null : this.getHelpCategoryId().equals(other.getHelpCategoryId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHelpTopicId() == null) ? 0 : getHelpTopicId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getHelpCategoryId() == null) ? 0 : getHelpCategoryId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", helpTopicId=").append(helpTopicId);
        sb.append(", name=").append(name);
        sb.append(", helpCategoryId=").append(helpCategoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}