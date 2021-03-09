package com.wills.java.factory_method.upgrade;

import com.wills.java.common.entity.AwardReq;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author 王帅
 * @date 2021-03-09 10:42:14
 * @description:
 */
@Slf4j
public class FactoryMethodMode {


    @Test
    public void test() throws Exception {
        FactoryStore store = new FactoryStore();
        AwardReq req = new AwardReq("1","qskf24FJDsidg3aiFF","asdfhdj3DJHFD",1,"abccccc","aaaa");
        // 测试
        log.info("测试发放奖券结果：{}",store.getFactoryService(req.getAwardType()).sendAward(req));
        req.setAwardType(2);
        log.info("测试发放商品结果：{}",store.getFactoryService(req.getAwardType()).sendAward(req));
        req.setAwardType(3);
        log.info("测试发放VIP结果：{}",store.getFactoryService(req.getAwardType()).sendAward(req));
    }
}
