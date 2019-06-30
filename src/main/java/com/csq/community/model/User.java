package com.csq.community.model;

import lombok.Data;

/**
 * @author ercai
 * @date 2019/6/28 - 10:30
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
