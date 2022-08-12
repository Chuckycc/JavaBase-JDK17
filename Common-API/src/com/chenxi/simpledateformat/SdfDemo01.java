package com.chenxi.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SdfDemo01 {
    public static void main(String[] args) {
        /*  public SimpleDateFormat()     默认格式
            public SimpleDateFormat (String pattern)   指定格式

            public final String format (Date date)      格式化 (日期对象 -＞字符串）
            public Date parse(String source)        解析（字符串 ->期对象）
         */

        //1.利用空餐构造创建SimpleDateFormat格式，使用默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1. format (d1) ;
        System.out.println(str1);//1970/1/1 上午8:00

        SimpleDateFormat sdf2 = new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss EE");
        String str2 = sdf2. format (d1) ;
        System.out.println(str2);//1970年01月01日 08:00:00 周四
    }
}
