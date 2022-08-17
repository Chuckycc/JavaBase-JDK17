package com.chenxi.jdk8datedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        //获取当前时间的日历对象 （包含年月日时分秒）
        LocalDateTime nowDateTime = LocalDateTime.now();

        System.out.println("今天是：" + nowDateTime);//今天是：2022-08-16T21:25:58.745269

        System.out.println(nowDateTime.getYear());//2022
        System.out.println(nowDateTime.getMonthValue());//8
        System.out.println(nowDateTime.getDayOfMonth());//16
        System.out.println(nowDateTime.getHour());//21
        System.out.println(nowDateTime.getMinute());//25
        System.out.println(nowDateTime.getSecond());//58
        System.out.println(nowDateTime.getNano());//745269000


        System.out.println("dayOfYear: " + nowDateTime.getDayOfYear()); //dayOfYear: 228

        System.out.println(nowDateTime.getDayOfWeek()); //TUESDAY
        System.out.println(nowDateTime.getDayOfWeek().getValue()); //2

        System.out.println(nowDateTime.getMonth()); //AUGUST
        System.out.println(nowDateTime.getMonth().getValue()); //8

        LocalDate ld = nowDateTime. toLocalDate();
        System.out.println(ld); //2022-08-16
        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour()); //21
        System.out.println(lt.getMinute()); //25
        System.out.println(lt.getSecond()); //58
    }
}
