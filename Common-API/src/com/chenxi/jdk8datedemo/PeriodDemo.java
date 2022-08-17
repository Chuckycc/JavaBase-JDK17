package com.chenxi.jdk8datedemo;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {

        //当前本地的年月日
        LocalDate today = LocalDate.now();
        System.out.println(today); //2022-08-16
        // 生日的年月日
        LocalDate birthDate = LocalDate.of( 2000,1, 1);
        System.out.println(birthDate); //2000-01-01
        Period period = Period.between(birthDate, today);//第二个参数减第一个參数

        System.out.println("相差的时间间隔对象："+ period); //相差的时间间隔对象：P22Y7M15D
        System.out.println(period.getYears()); //22
        System.out.println(period.getMonths()); //7
        System.out.println(period.getDays()); //15
        System.out.println(period.toTotalMonths()); //271
    }
}
