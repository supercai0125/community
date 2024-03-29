package com.csq.community.model;

import lombok.Data;

/**
 * @author ercai
 * @date 2019/6/29 - 18:07
 */
@Data
public class Question {

    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
