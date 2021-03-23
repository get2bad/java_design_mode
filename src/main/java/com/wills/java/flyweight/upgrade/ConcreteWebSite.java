package com.wills.java.flyweight.upgrade;

import com.wills.java.flyweight.common.User;
import com.wills.java.flyweight.common.Website;

/**
 * @author 王帅
 * @date 2021-03-23 13:59:52
 * @description:
 */
public class ConcreteWebSite extends Website {
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + "使用者是：" + user.getName());
    }
}
