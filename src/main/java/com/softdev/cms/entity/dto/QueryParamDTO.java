package com.softdev.cms.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryParamDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    Integer userId;
    Integer createUserId;
    String userName;
    String showName;
    Integer articleId;
    Integer parentChannelId;
    String title;
    Integer formId;
    Integer submitId;
    Integer channelId;
    Integer classesId;
    Integer status;
    Integer page;
    Integer limit;

    public void setPageLimit(Integer page,Integer limit) {
        this.page = (page-1)*limit;
        this.limit = limit;
    }
}
