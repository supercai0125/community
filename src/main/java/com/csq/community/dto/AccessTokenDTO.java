package com.csq.community.dto;

import lombok.Data;

/**
 * @author ercai
 * @date 2019/6/26 - 9:12
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
