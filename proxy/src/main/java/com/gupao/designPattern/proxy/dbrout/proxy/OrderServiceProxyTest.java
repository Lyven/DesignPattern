package com.gupao.designPattern.proxy.dbrout.proxy;

import com.gupao.designPattern.proxy.dbrout.Order;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-22
 */
public class OrderServiceProxyTest {
    public static void main(String[] args) {
        OrderServiceStaticProxy ossp = new OrderServiceStaticProxy();
        Order order = new Order();

        order.setFdCreateTime(System.currentTimeMillis());
        order.setFdName("办公用品采购订单");
        order.setFdId(1);

        ossp.createOrder(order);
    }
}
