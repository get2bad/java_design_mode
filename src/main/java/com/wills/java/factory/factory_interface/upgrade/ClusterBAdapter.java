package com.wills.java.factory.factory_interface.upgrade;

import com.wills.java.factory.factory_interface.common.ClusterA;
import com.wills.java.factory.factory_interface.common.ClusterB;

import java.util.concurrent.TimeUnit;

/**
 * @author 王帅
 * @date 2021-03-10 11:50:30
 * @description:
 */
public class ClusterBAdapter implements ICacheAdapter{

    ClusterB clusterB;

    public ClusterBAdapter() {
        clusterB = new ClusterB();
    }

    @Override
    public String get(String key) {
        return clusterB.get(key);
    }

    @Override
    public void set(String key, String value) {
        clusterB.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        clusterB.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        clusterB.del(key);
    }
}
