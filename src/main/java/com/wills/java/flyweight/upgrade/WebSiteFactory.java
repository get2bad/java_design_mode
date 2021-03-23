package com.wills.java.flyweight.upgrade;

import com.wills.java.flyweight.common.User;
import com.wills.java.flyweight.common.Website;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王帅
 * @date 2021-03-23 13:53:34
 * @description:
 */
public class WebSiteFactory {

    private Map<String, Website> pool = new HashMap<>();

    public Website getWebsiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public int getWebCount(){
        return pool.size();
    }
}
