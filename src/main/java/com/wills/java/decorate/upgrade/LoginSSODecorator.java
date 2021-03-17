package com.wills.java.decorate.upgrade;

import com.wills.java.decorate.common.Interceptor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 王帅
 * @date 2021-03-17 11:37:36
 * @description:
 */
@Slf4j
public class LoginSSODecorator extends SSODecorator{

    private static Map<String,String> authMap = new ConcurrentHashMap<>();

    static {
        // 一般都是数据库获取，现在模拟就不通过数据库，尽量简单为主
        authMap.put("wang","admin");
        authMap.put("shuai","admin");
        authMap.put("lao","admin");
    }

    public LoginSSODecorator() {
    }

    public LoginSSODecorator(Interceptor interceptor) {
        super(interceptor);
    }

    @Override
    public boolean preHandle(String req, String resp, Object handler) {
        // 模拟获取cookie
        String auth = req.substring(0, 7);
        // 模拟校验
        boolean success = auth.equals("success");

        if (!success) return false;
        String userName = req.substring(8);
        String method = authMap.get(userName);
        // 模拟⽅法校验
        return "admin".equals(method);
    }
    public boolean operateOther(){
        System.out.println("正在处理其他内容");
        return 1 == 1;
    }
}
