package com.wills.java.flyweight.upgrade;

import com.wills.java.flyweight.common.User;
import com.wills.java.flyweight.common.Website;

/**
 * @author 王帅
 * @date 2021-03-23 14:06:29
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test(){
        WebSiteFactory factory = new WebSiteFactory();

        Website website1 = factory.getWebsiteCategory("新闻");
        website1.use(new User("隔壁老王"));

        Website website2 = factory.getWebsiteCategory("博客");
        website2.use(new User("隔壁老阮"));

        Website website3 = factory.getWebsiteCategory("微信公众号");
        website3.use(new User("隔壁老baby"));

        Website website4 = factory.getWebsiteCategory("论坛");
        website4.use(new User("隔壁老帅"));
    }
}
