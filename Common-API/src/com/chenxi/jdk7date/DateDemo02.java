package com.chenxi.jdk7date;

import java.util.Date;
import java.util.Random;

public class DateDemo02 {
    public static void main(String[] args) {
        //需求1：打印时间原点开始一年之后的时间
        //需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后

        //需求1：打印时问原点开始一年之后的时间
        //1.创建一个对象，表示时间原点
        Date d = new Date(0L);
        //2.获取d1时问的亳秒值
        long time = d.getTime();
        //3.在这个基础上我们要加一年的毫秒值即可
        time = time + 1000L * 60 * 60 * 24 * 365;
        //4.把计算之后的时间毫秒值，再设置回d1当中
        d.setTime(time);
        //5.打印
        System.out.println(d);//Fri Jan 01 08:00:00 CST 1971

        //需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if(time1 > time2){
            System.out.println("第一个时间在后面，第二个时间在前面");
        }else if (time1 < time2) {
            System.out.println("第一个时间在前面，第二个时间在后面");
        } else {
            System.out.println("两个时间相同");
        }
    }
}
