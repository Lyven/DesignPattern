package com.gupao.designPattern.proxy.dbrout;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-21
 */
public class OrderDaoImp implements IOrderDao{
    public String addOrder(Order order){
        System.out.println("创建订单成功");
        return "1";
    }
}
