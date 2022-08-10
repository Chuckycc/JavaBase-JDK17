package com.chenxi.regex;

public class RegexDemo11 {
    public static void main(String[] args) {

        //需求1：判断一个字符串的开始字符和结束宇符是否一致？只考虑一个字符
        //举例：a123a b456b 17891 &abc& a123b(false)
        //组号：表示把第x组的内容再出来用一次
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches (regex1)) ;
        System.out.println("b456b".matches (regex1));
        System.out.println("17891" .matches (regex1)) ;
        System.out.println("&abc&".matches (regex1));
        System.out.println("a123b".matches (regex1));
        System.out.println("-------------------------------");


        //需求2：判断一个字符串的开始部分和结束部分是否一致？可以有多个字符
        //   abc123abc b456b 123789123 &!@ab&!@ abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches (regex2));
        System.out.println("b456b".matches (regex2)) ;
        System.out.println("123789123".matches (regex2)) ;
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abc".matches (regex2));
        System.out.println("abc123abd".matches(regex2)); //false
        System.out.println("------------------------");

        //需求3：判断一个字符串的开始部分和结束部分是否一致？开始部分内部每个字符也需要一致
        //举例：aaa123aaa b456bbb 111789111 88abc88
        //(.) : 把首字母看作一个分组组
        // \\1:重复第一个分组
        //* 作用于\\1 出现0次或多次
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("b456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("88abc88".matches(regex3));
        System.out.println("88abc79".matches(regex3)); //false

    }
}
