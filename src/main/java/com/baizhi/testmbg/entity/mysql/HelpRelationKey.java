package com.baizhi.testmbg.entity.mysql;

import java.io.Serializable;

public class HelpRelationKey implements Serializable {
    private Integer helpKeywordId;

    private Integer helpTopicId;

    private static final long serialVersionUID = 1L;

    public Integer getHelpKeywordId() {
        return helpKeywordId;
    }

    public void setHelpKeywordId(Integer helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }

    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
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
        HelpRelationKey other = (HelpRelationKey) that;
        return (this.getHelpKeywordId() == null ? other.getHelpKeywordId() == null : this.getHelpKeywordId().equals(other.getHelpKeywordId()))
            && (this.getHelpTopicId() == null ? other.getHelpTopicId() == null : this.getHelpTopicId().equals(other.getHelpTopicId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHelpKeywordId() == null) ? 0 : getHelpKeywordId().hashCode());
        result = prime * result + ((getHelpTopicId() == null) ? 0 : getHelpTopicId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", helpKeywordId=").append(helpKeywordId);
        sb.append(", helpTopicId=").append(helpTopicId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}