package com.wills.java.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王帅
 * @date 2021-03-09 10:47:49
 * @description:
 *
 * 通用实体类 - 奖品类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Award {

    private String id;
    private Integer awardType;
    private String awardNumber;
    private String bizId;
}
