package com.chenxi.jdk8datedemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {

        //获取当前时间
        LocalDateTime today = LocalDateTime.now() ;
        System.out.println(today); //2022-08-16T22:34:31.217568

        LocalDateTime birthDate = LocalDateTime.of(2000,1,1, 0, 0,0);
        System.out.println(birthDate); //2000-01-01T00:00
        System.out.println("相差的年数："+ ChronoUnit.YEARS.between(birthDate, today)) ; //相差的年数：22
        System.out.println("相差的月数："+ ChronoUnit.MONTHS.between (birthDate, today)) ; //相差的月数：271
        System.out.println("相差的周数："+ ChronoUnit.WEEKS.between(birthDate, today)) ; //相差的周数：1180
        System.out.println("相差的天数："+ ChronoUnit.DAYS.between (birthDate, today)) ; //相差的天数：8263
        System.out.println("相差的时数："+ ChronoUnit.HOURS.between(birthDate, today)) ; //相差的时数：198334
        System.out.println("相差的分数："+ ChronoUnit.MINUTES.between (birthDate, today)) ; //相差的分数：11900074
        System.out.println("相差的秒数："+ ChronoUnit.SECONDS.between (birthDate, today)) ; //相差的秒数：714004471
        System.out.println("相差的毫秒数："+ ChronoUnit.MILLIS.between (birthDate, today)); //相差的毫秒数：714004471217
        System. out.println("相差的微秒数：" +ChronoUnit.MICROS.between (birthDate, today)) ; //相差的微秒数：714004471217568
        System.out.println("相差的纳秒数："+ ChronoUnit.NANOS.between (birthDate, today)); //相差的纳秒数：714004471217568000
        System.out.println("相养的半天数：" + ChronoUnit.HALF_DAYS.between(birthDate, today)); //相养的半天数：16527
        System.out.println("相差的十年数：" + ChronoUnit.DECADES.between(birthDate, today)); //相差的十年数：2
        System.out.println("相差的世纪（百年）数：" + ChronoUnit.CENTURIES.between (birthDate, today)); //相差的世纪（百年）数：0
        System.out.println("相差的千年数："+ ChronoUnit.MILLENNIA.between(birthDate, today)) ; //相差的世纪（百年）数：0
        System.out.println("相差的纪元数：" + ChronoUnit.ERAS.between (birthDate, today)) ; //相差的纪元数：0
    }
}
