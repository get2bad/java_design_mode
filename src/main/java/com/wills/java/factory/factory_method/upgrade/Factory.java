package com.wills.java.factory.factory_method.upgrade;

import com.wills.java.common.entity.AwardReq;

/**
 * @author 王帅
 * @date 2021-03-09 11:47:39
 * @description:
 */
public interface Factory {

    String sendAward(AwardReq req) throws Exception;
}
