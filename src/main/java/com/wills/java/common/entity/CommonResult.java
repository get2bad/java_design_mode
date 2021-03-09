package com.wills.java.common.entity;

import com.wills.java.common.util.UUIDGenerate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author 王帅
 * @date 2021-03-09 11:09:38
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommonResult<T> {

    private ResponseEnum res;

    private T data;

    private String msg;

    private String reqToken;

    public static <T> CommonResult<T> ok(T data){
        return new CommonResult(ResponseEnum.OK,data,null, UUIDGenerate.generateStr());
    }

    public static CommonResult faild(){
        return new CommonResult(ResponseEnum.FAIL,null,null,UUIDGenerate.generateStr());
    }

    public static <T> CommonResult<T> msgOK(T data, String msg){
        return new CommonResult(ResponseEnum.OK,data,msg,UUIDGenerate.generateStr());
    }

    public static CommonResult msgFaild(String msg){
        return new CommonResult(ResponseEnum.FAIL,null,msg,UUIDGenerate.generateStr());
    }
}
