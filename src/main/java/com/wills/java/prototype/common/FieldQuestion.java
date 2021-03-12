package com.wills.java.prototype.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 王帅
 * @date 2021-03-12 11:31:21
 * @description:
 * 填空题
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FieldQuestion {

    // 题目
    private String name;
    // 作答的答案
    private String res;
}
