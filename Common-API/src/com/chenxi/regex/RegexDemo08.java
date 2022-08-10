package com.chenxi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo08 {
    public static void main(String[] args) {
        /* 有如下文本，请按照要求爬取数据，
            "Java自从95年问世以来，经历了很多版木，目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台"
        需求1：爬取版本号为8,11，17的Java文本，但是只要Java，不显示版本号。
        需求2：爬取版本号为8,11，17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
        需求3：爬取除了版本号为8,11，17的Java文本
        */
        String s = "Java自从95年问世以来，经历了很多版木，目前企业中用的最多的是JavA8和Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是JaVa17，相信在未来不久java17也会逐渐登上历史舞台";
        //1.定义正则表达式
        //?理解为前面的数据Java
        // =表示在Java后面要踉随的数据
        //但是在获取的时候，只获取前半部分
        //该regex只获取Java8/Java11/Java17，不获取Java
        //需求1：爬取版本号为8,11，17的Java文本，但是只要Java，不显示版本号。
        //String regex= "Java(?=8|11|17)";
        //(?i) 表示后面的部分忽略大小写
        String regex = "((?i)Java)(?=8|11|17)";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group());
        }
        System.out.println("-----------------------------");

        /*
        output:
            Java
            Java
            Java
            Java
        */

        //需求2：爬取版本号为8,11，17的Java文本。正确爬取结果为：JavA8 Java11 JaVa17 java17
        String regex1 = "((?i)Java)(8|11|17)";
        //?:表示获取整体
        //String regex2 = "((?i)Java)(?:8|11|17)";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }
        System.out.println("------------------------");

        /*
        output:
            JavA8
            Java11
            JaVa17
            java17
        */

        //需求3：爬取除了版本号为8,11，17的Java文本
        //正确结果为：java
        //?! 表示后面跟着8/11/17时不匹配
        String regex3 = "((?i)Java)(?!8|11|17)";
        Pattern p2 = Pattern.compile(regex3);
        Matcher m2 = p2.matcher(s);

        while (m2.find()) {
            System.out.println(m2.group());
        }
        /*
        output：
            Java
         */

    }
}


