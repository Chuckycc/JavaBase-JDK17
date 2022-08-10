package com.chenxi.regex;

public class RegexDemo01 {
    public static void main(String[] args) {
        //校验qq是否满足规则
        //不以0开头/长度为6-20/必须全部是数字
        String qq = "7483i278915";

        boolean res = qq.matches("[1-9]\\d{5,19}");

        System.out.println(res);
    }
}
