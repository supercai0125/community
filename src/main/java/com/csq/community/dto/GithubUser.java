package com.csq.community.dto;

import lombok.Data;

/**
 * @author ercai
 * @date 2019/6/26 - 10:12
 */
@Data
public class GithubUser {
    private String name;
    private Long id;   //唯一id
    private String bio; //个人描叙
    private String avatar_url;  //头像地址
}
