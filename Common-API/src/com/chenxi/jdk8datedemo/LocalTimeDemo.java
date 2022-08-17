package com.chenxi.jdk8datedemo;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        //获取本地时间的对象 （包含 时分秒）
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间" + nowTime); //今天的时间21:14:38.757890

        int hour = nowTime.getHour();//时
        System.out.println("hour:" + hour);//hour:21

        int minute = nowTime.getMinute();//分
        System.out.println("minute" + minute); //minute14
        int second = nowTime.getSecond();//秒
        System.out.println("second: " + second);//second: 38
        int nano = nowTime.getNano();//纳秒
        System.out.println("nano" + nano); //nano757890000


        System.out.println(LocalTime.of(8, 20)); //时分：08:20
        System.out.println(LocalTime.of(  8, 20,  30)); //时分秒 ：08:20:30
        System.out.println(LocalTime.of(8, 20, 30,  150)) ;//时分秒纳秒 ：08:20:30.000000150
        LocalTime mTime = LocalTime.of( 8, 20, 30, 150);

        //is系列的方法判断
        System.out.println(nowTime.isBefore(mTime)); //false
        System.out.println(nowTime.isAfter(mTime)); //true

        //with系列的方法，只能修改时、分、秒
        System.out.println(nowTime.withHour(10)); //10:14:38.757890

        //minus 系列的方法，只能减少时、分、秒
        System.out.println(nowTime.minusHours(10)); //11:14:38.757890

        //plus系列的方法，只能增加时、分、秒
        System.out.println(nowTime.plusHours(10)); //07:14:38.757890
    }
}
