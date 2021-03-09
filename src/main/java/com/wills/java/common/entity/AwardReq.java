package com.wills.java.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王帅
 * @date 2021-03-09 10:50:23
 * @description:
 *
 * 模拟前端发送的Json 然后封装成的实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AwardReq {

    private String userId;
    private String code;
    private String reqToken;
    private Integer awardType;
    private String awardNumber;
    private String bizId;
}
