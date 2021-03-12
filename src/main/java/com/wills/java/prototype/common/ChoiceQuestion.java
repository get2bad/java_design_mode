package com.wills.java.prototype.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author 王帅
 * @date 2021-03-12 11:29:50
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoiceQuestion {

    // 题目
    private String name;
    // 选项
    private Map<String,String> option;
}
