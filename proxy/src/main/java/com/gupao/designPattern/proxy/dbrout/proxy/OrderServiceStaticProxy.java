package com.gupao.designPattern.proxy.dbrout.proxy;

import com.gupao.designPattern.proxy.dbrout.DynamicDateSourceEntry;
import com.gupao.designPattern.proxy.dbrout.IOrderService;
import com.gupao.designPattern.proxy.dbrout.Order;
import com.gupao.designPattern.proxy.dbrout.OrderServiceImp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-22
 */
public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    private IOrderService orderService;

    public OrderServiceStaticProxy(){
        this.orderService = new OrderServiceImp();
    }

    public String createOrder(Order order) {
        before();
        Long createTime = order.getFdCreateTime();
        int year = Integer.parseInt(sdf.format(new Date(createTime)));
        DynamicDateSourceEntry.set(year);
        String rst = orderService.createOrder(order);
        after();
        DynamicDateSourceEntry.restore();
        return rst;
    }

    private void before(){
        System.out.println("开始调用");

    }

    private void after(){
        System.out.println("调用结束");
    }
}
