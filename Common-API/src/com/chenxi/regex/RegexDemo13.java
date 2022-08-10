package com.chenxi.regex;

public class RegexDemo13 {
    public static void main(String[] args) {
        /*非捕获分组：分组之后不需要再用本组数据，仅仅是把数据括起来。
        身份证号码：
        41080119930228457x
        510801197609022309
        15040119810705387X
        130133197204039024
        430102197606046442
         */

        //身价证号码的简易正则表达式
        //非捕获分组：仅仅是把数据括起米
        //特点：不占用组号
        //这里 \\1报错原因：(?:)是非捕获分组，此时是不占用组号的。
        // (?:) (?=） （?!） 都是非抽获分组心
        //第一种比较常用
        String regex = "[1-9]\\d{16}(?:\\d|X|x)\\1";
        //"[1-9]\d{16}(?:\d|X|x)"效果等同于"[1-9]\d{16}(\d|X|x)"
        System.out.println("41080119930228457x".matches(regex));
    }
}