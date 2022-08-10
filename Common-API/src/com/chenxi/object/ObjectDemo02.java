package com.chenxi.object;

public class ObjectDemo02 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));//false
        //因为equals方法是被s调用的，而s是字符串
        //所以equals是String类中的
        //字符串中的equals方法，首先判断参数是否为字符串，再比较内部的属性
        //如果参数不是字符串，则返回false

        System.out.println(sb.equals(s));//false
        //因为equals是StringBuilder调用的
        //所以要看StringBuilder中的equals方法，而StringBuilder中没有重写equals
        //所以调用的是Object的equals方法，比较地址值
        //地址值不一致则false
    }
}
