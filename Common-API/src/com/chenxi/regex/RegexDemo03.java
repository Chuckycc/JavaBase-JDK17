package com.chenxi.regex;

public class RegexDemo03 {
    public static void main(String[] args) {
        // \ 转义字符： 改变后面那个字符原本的含义

        //以字符串的形式打印双引号
        System.out.println("\"");//"

        //.表示任意一个字符
        System.out.println("------------------1---------------------");
        System.out.println("你".matches("..")); //false
        System.out.println("你o".matches("..")); //true

        // \\d表示任意的一位数字
        // 两个\表示\
        System.out.println("------------------2---------------------");
        System.out.println("a".matches("\\d")); //false
        System.out.println("3".matches("\\d")); //true
        System.out.println("333".matches("\\d")); //false

        // \\w 表示任意一个[a-zA-Z_0-9]字符
        System.out.println("------------------3---------------------");
        System.out.println("a".matches("\\w")); //true
        System.out.println("8".matches("\\w")); //true
        System.out.println("8b".matches("\\w")); //false
        System.out.println("_".matches("\\w")); //true

        // \\W 表示 非[a-zA-Z_0-9]字符
        System.out.println("------------------4---------------------");
        System.out.println("a".matches("\\W")); //false
        System.out.println("你".matches("\\W")); //true

        //以上正则匹配单个字符

        //必须是 数字 字母 下划线 且至少六位
        System.out.println("------------------5---------------------");
        System.out.println("32fsdfdf".matches("\\w{6,}")); //true
        System.out.println("3df".matches("\\w{6,}")); //false

        //必须是数字和字符 必须四位
        System.out.println("------------------6---------------------");
        System.out.println("23de".matches("[a-zA-Z0-9]{4}")); //true
        System.out.println("2de".matches("[a-zA-Z0-9]{4}")); //false
        System.out.println("23de".matches("[\\w&&[^_]]{4}")); //true
        System.out.println("2de".matches("[\\w&&[^_]]{4}")); //false

    }
}
