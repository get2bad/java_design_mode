package com.wills.java.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王帅
 * @date 2021-03-09 11:11:15
 * @description:
 */
@AllArgsConstructor
@NoArgsConstructor
public enum ResponseEnum {

    OK(1,"操作成功"),
    SIGN_IN_OK(2,"登录成功"),
    LOGOUT_OK(3,"注销登录成功"),
    SIGN_IN_INPUT_FAIL(-4,"账号或密码错误"),
    SIGN_IN_FAIL(-3,"登录失败"),
    FAIL(-1,"操作失败"),
    LOGOUT_FAIL(-2,"注销登录失败"),
    SING_IN_INPUT_EMPTY(-5,"账户和密码均不能为空"),
    DATA_REPEAT(-6,"数据重复"),
    NOT_SING_IN(-7,"用户未登录或身份异常");

    public Integer code;

    public String msg;
}
