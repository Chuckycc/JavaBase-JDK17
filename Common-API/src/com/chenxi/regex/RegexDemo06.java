package com.chenxi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo06 {
    public static void main(String[] args) {
        /* 存如下文木，请按照要求爬取数据。
        Java自从95年问世以来，经历了很多版木，目前企业中用的最多的是Java8和Java11因为这两个是长期支持版木，" +
                "下一个长期支持版是Java17，相信在未来不久Java17也会逐渐登上历史舞台
        要求：找出里面所有的JavaXX
         */

        String str = "Java自从95年问世以来，经历了很多版木，目前企业中用的最多的是Java8和Java11因为这两个是长期支持版木，" +
                "下一个长期支持版是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //Pattern：表示正则表达式
        //Matcher：文本匹配器，作用按照正则表达式去读取字符串，从头开始读取
        // 如何从大串中找到符合匹配规则的子串

        //获取正则表达式的对象
        Pattern pattern = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象
        Matcher matcher = pattern.matcher(str);
        //matcher对象要在str中找到符合pattern规则的小串

        //拿文本匹配器从头开始读取，寻找是否有满足规则的字符串
        // 每调用一次find返回最先找到的匹配子串，指针停在子串+1的位置，想要接着调用就要重复调用find
        //没有 返回false
        //有   返回true 并在底层记录子串的起始索引和结束索引+1
        //boolean b = matcher.find();

        //根据find方法记录的索引进行字符串的截取（subString）
        // String s1 = matcher.group();

        while (matcher.find()) {
            String s1 = matcher.group();
            System.out.println(s1);
        }

    }
}

/*
output:
Java
Java8
Java11
Java17
Java17
 */
