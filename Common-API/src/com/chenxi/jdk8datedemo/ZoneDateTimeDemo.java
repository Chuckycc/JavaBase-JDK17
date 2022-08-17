package com.chenxi.jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        /*
            static ZonedDateTime now()  获取当前时间的zonedDateTime对象
            static ZonedDateTime ofXxxx()   获取指定时间的zonedDateTime对線
            ZonedDateTime withxxx(时间)   修改时间系列的方法
            ZonedDateTime minusxxx(时间)  减少时间系列的方法
            ZonedDateTime plusxxx(时间)     增加时间系列的方法

         */

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now); //2022-08-17T10:39:14.955303+08:00[Asia/Shanghai]

        //2.获收指定的时间对象（带时区）
        ZonedDateTime time1 = ZonedDateTime.of(2023,10, 1, 11,12, 12,
                0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1); //2023-10-01T11:12:12+08:00[Asia/Shanghai]

        //通过Instant ＋时区的方式指定获取时间对象
        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of ("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2); //1970-01-01T08:00+08:00[Asia/Shanghai]

        //3.withxxx 修改时间系列的方法
        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3); //2000-01-01T08:00+08:00[Asia/Shanghai]

        // 4 减少时间
        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4); //1999-01-01T08:00+08:00[Asia/Shanghai]

        //5 增加时间
        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5); //2000-01-01T08:00+08:00[Asia/Shanghai]
    }
}
