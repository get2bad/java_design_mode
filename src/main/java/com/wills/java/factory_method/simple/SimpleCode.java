package com.wills.java.factory_method.simple;

import com.wills.java.common.entity.Award;
import com.wills.java.common.entity.AwardReq;
import com.wills.java.common.entity.CommonResult;
import com.wills.java.factory_method.service.CouponService;
import com.wills.java.factory_method.service.GoodsService;
import com.wills.java.factory_method.service.VIPService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author 王帅
 * @date 2021-03-09 10:45:12
 * @description:
 * 通常不会涉及模式写的代码
 *
 * 各种 if else if else 然后逻辑性很差
 *
 * 这种做法仅仅是为了应付业务逻辑，但是后期维护极难，因为需要熟读代码，可维护性极差，为了实现业务而实现
 */
@Slf4j
public class SimpleCode {

    public CommonResult sendAward(AwardReq awardReq) throws InterruptedException {
        log.info("开发发放奖品：{}", awardReq.toString());
//        Thread.sleep(2000);
        String res = "";
        // 开始发放奖品
        if(awardReq.getAwardType() == 1){
            // 正常的Springboot项目自动注入，因为这个是基础的maven项目，暂时使用创建对象
            CouponService service = new CouponService();
            // 发放奖品
            res = service.sendCoupon(awardReq.getUserId(), awardReq.getAwardNumber());
            log.info("发放奖品结果:{}",res);
        } else if(awardReq.getAwardType() == 2){
            GoodsService goodsService = new GoodsService();
            res = goodsService.sendGoods(awardReq.getUserId(), awardReq.getAwardNumber());
            log.info("发放商品结果:{}",res);
        } else if(awardReq.getAwardType() == 3){
            VIPService vipService = new VIPService();
            res = vipService.sendGoods(awardReq.getUserId(),awardReq.getAwardNumber());
            log.info("发放vip结果:{}",res);
        }
        return CommonResult.ok(res);
    }

    @Test
    public void test() throws InterruptedException {
        SimpleCode simpleCode = new SimpleCode();
        AwardReq req = new AwardReq("1","qskf24FJDsidg3aiFF","asdfhdj3DJHFD",1,"abccccc","aaaa");
        // 测试
        log.info("测试发放奖券结果：{}",simpleCode.sendAward(req));
        req.setAwardType(2);
        log.info("测试发放商品结果：{}",simpleCode.sendAward(req));
        req.setAwardType(3);
        log.info("测试发放VIP结果：{}",simpleCode.sendAward(req));
    }
}
