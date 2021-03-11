package com.wills.java.factory.factory_interface.upgrade;

import com.wills.java.factory.factory_interface.common.ClusterA;
import com.wills.java.factory.factory_interface.common.Redis;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author 王帅
 * @date 2021-03-10 11:50:30
 * @description:
 */
public class ClusterAAdapter implements ICacheAdapter{

    ClusterA clusterA;

    public ClusterAAdapter() {
         clusterA = new ClusterA();
    }

    @Override
    public String get(String key) {
        return clusterA.gain(key);
    }

    @Override
    public void set(String key, String value) {
        clusterA.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        clusterA.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        clusterA.delete(key);
    }
}
