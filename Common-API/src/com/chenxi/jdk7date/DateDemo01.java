package com.chenxi.jdk7date;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        /*
        public Date()               创建Date对象，表示当前时间
        public Date (long date)     创建Date对象，表示指定时间

        public void setTime (long time) 设置/修改亳秒值
        public long getTime() 获取时间对象的亳秒值
         */

        //1.创建对象表示一个时间
        Date d1 = new Date();
        System.out.println(d1); //Thu Aug 11 20:16:15 CST 2022

        //2.创建对象表示一个指定的时间
        Date d2 = new Date(0L);
        System.out.println(d2);
        //Thu Jan 01 08:00:00 CST 1970 北京东八区+8h

        //3. setTime 修改时间 1000ms
        d2.setTime(1000L);
        System.out.println(d2); //Thu Jan 01 08:00:01 CST 1970

        //4.getTime 获取当前时间的毫秒值
        long time = d2.getTime();
        System.out.println(time); //1000
    }
}
