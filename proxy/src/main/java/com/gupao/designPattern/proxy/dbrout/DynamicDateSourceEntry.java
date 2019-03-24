package com.gupao.designPattern.proxy.dbrout;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-21
 *
 * 通过Threadlocal实现单例
 */
public class DynamicDateSourceEntry {
    private static final String DEFALUT_SOURCE = null;

    //构造方法私有
    private DynamicDateSourceEntry(){}

    private static final ThreadLocal<String> instance = new ThreadLocal<String>();

    public static void clear(){
        instance.remove();
    }

    public static String get(){
        return  instance.get();
    }

    public static void set(String name){
        instance.set(name);
        System.out.println("自动分配到【" +  name + "】数据源处理数据" );
    }

    public static void restore(){
        instance.set(DEFALUT_SOURCE);
        System.out.println("重置数据源处理数据" );
    }

    public static void set(int year){
        instance.set("DB_"+year);
        System.out.println("自动分配到【DB_" +  year + "】数据源处理数据" );
    }
}
