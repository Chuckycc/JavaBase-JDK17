package com.chenxi.jdk8datedemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {
        //本地日期的时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today); //2022-08-16T22:27:53.627919

        LocalDateTime birthDate = LocalDateTime.of(2000,1,1,8, 00, 00);
        System.out.println(birthDate); //2000-01-01T08:00
        Duration duration = Duration.between(birthDate,today);//第二个参数滅第一个參数
        System.out.println("相差的时间间隔对象： " + duration); //相差的时间间隔对象： PT198326H27M53.627919S
        System.out.println("================================");
        System.out.println(duration. toDays());//两个时间差的天数:8263
        System.out.println(duration.toHours());//两个时间差的小时数:198326
        System.out.println(duration.toMinutes());//两个时间养的分钟数:11899587
        System.out.println(duration.toMillis());//两个时间差的亳秒数:713975273627
        System.out.println(duration.toNanos());//两个时间差的纳秒数:713975273627919000
    }
}
