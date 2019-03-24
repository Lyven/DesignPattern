package com.gupao.designPattern.proxy.dbrout;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-21
 */
public class Order {
    public int fdId;
    public String fdName;
    public Long fdCreateTime;

    public int getFdId() {
        return fdId;
    }

    public void setFdId(int fdId) {
        this.fdId = fdId;
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public Long getFdCreateTime() {
        return fdCreateTime;
    }

    public void setFdCreateTime(Long fdCreateTime) {
        this.fdCreateTime = fdCreateTime;
    }
}
