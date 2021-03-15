package com.wills.java.adapter.common;

import lombok.Data;

import java.util.Date;

/**
 * @author 王帅
 * @date 2021-03-15 11:41:57
 * @description:
 * 用户注册实体类
 */
@Data
public class CreateUser {

    private Integer id;
    private String userName;
    private String pwd;
    private String createTime;
    private String remark;
    private Integer type;
}
