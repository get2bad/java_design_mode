package com.wills.java.factory.factory_interface.simple;

import com.wills.java.factory.factory_interface.common.*;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author 王帅
 * @date 2021-03-10 11:26:44
 * @description:
 */
public class CacheServiceImpl implements CacheService {

    private Integer type;

    private Map<String, String> data;

    private SingleRedis singleRedis;
    private ClusterA clusterA;
    private ClusterB clusterB;

    public CacheServiceImpl() {
    }

    public CacheServiceImpl(Integer type) {
        this.type = type;
        singleRedis = new SingleRedis();
        clusterA = new ClusterA();
        clusterB = new ClusterB();
        data = Redis.getInstance();
    }

    @Override
    public String get(String key) {
        if(type != null){
            if(1 == type){
                return singleRedis.get(key);
            } else if(2 == type){
                return clusterA.gain(key);
            } else if(3 == type){
                return clusterB.get(key);
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public void set(String key, String value) {
        if(type != null){
            if(1 == type){
                singleRedis.set(key,value);
            } else if(2 == type){
                clusterA.set(key,value);
            } else if(3 == type){
                clusterB.set(key, value);
            }
        }
    }

    @Override
    public void set(String key, String value, long timeExpire, TimeUnit timeUnit) {
        if(type != null){
            if(1 == type){
                singleRedis.set(key,value,timeExpire,timeUnit);
            } else if(2 == type){
                clusterA.setEx(key,value,timeExpire,timeUnit);
            } else if(3 == type){
                clusterB.setExpire(key,value,timeExpire,timeUnit);
            }
        }
    }

    @Override
    public void del(String key) {
        if(type != null){
            if(1 == type){
                singleRedis.del(key);
            } else if(2 == type){
                clusterA.delete(key);
            } else if(3 == type){
                clusterB.del(key);
            }
        }
    }
}
