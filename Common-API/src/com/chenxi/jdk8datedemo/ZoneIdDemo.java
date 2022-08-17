package com.chenxi.jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {
        /*
        static Set‹String› getAvailableZoneIds()    获取Java中支持的所有时区
        static ZoneId SystemDefault()    获取系统默认肘区
        static ZoneId of (String zoneId)     获取一个指定时区

         */


        //1. 获取所有的时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());//601
        System.out.println(zoneIds);//

        //2.获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai

        //3.获取指定的时区
        ZoneId zoneId1 = ZoneId.of("Asia/Pontianak");
        System.out.println(zoneId1);//Asia/Pontianak
    }
}
