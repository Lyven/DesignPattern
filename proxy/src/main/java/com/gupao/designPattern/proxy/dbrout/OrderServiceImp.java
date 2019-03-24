package com.gupao.designPattern.proxy.dbrout;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-21
 */
public class OrderServiceImp implements IOrderService{
    private IOrderDao orderDao;
    public OrderServiceImp(){
        this.orderDao = new OrderDaoImp();
    }
    public String createOrder(Order order) {
        System.out.println("调用DAO层，进行写入订单");
        return orderDao.addOrder(order);
    }
}
