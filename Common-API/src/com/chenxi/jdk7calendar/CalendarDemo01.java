package com.chenxi.jdk7calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo01 {
    public static void main(String[] args) {
        /*
           public static Calendar getInstance() 获取当前时间的日历对象

           public final Date getTime()  获取日期对象
           public final setTime(Date date)  给日历设置日期对象

           public long getTimeInMillis()    拿到时间毫秒值
           public void setTimeInMillis (long millis)    给日历设罝时间豪秒值


           public int get (int field)   取日期中的某个字段信息
           public void set (int field, int value)   修改日历的某个字段信息
           public void add(int field, int amount)        为某个字段增加/减少指定的值

         */

        //1.获取口历对象
        //细节：Calendar是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象
        //底层原理：
        //会根据系统的不同时区来获取不同的日历对象。
        //把会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组当中
        //0：纪元
        //1: 年
        //2:月
        //3:一年中的第几周
        //4:一个月中的第几周
        //5: 一个月中的第几天(日期)
        // .. 16

        //月份：范围0~11 如果获取出来的是0.那么实际上是1月。
        //星期：在老外的眼里，星期日是一周中的第一天
        //1（星期日）2（星期一）3（星期二）4（星期三）5（星期四）6（星期五）7（星期六）
        Calendar c = Calendar.getInstance();

        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);

        //public int get (int field)
        //public void set (int field, int value)
        //public void add (int field, int amount)
        c.set(Calendar.YEAR, 2023) ;
        c.set(Calendar.MONTH, 8) ;
        c.set(Calendar.DAY_OF_MONTH,10) ;
        //调用方法在这个基础上增加一个月，正数增加 负数减小
        c.add(Calendar.MONTH, -1) ;
        System.out.println(c);
    }
}
