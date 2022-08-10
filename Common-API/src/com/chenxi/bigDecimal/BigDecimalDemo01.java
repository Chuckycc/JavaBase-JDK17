package com.chenxi.bigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo01 {
    public static void main(String[] args) {
        //有时候float不能精确表示小数
        System.out.println(0.01+0.09); //0.09999999999999999
        System.out.println(0.09); //0.09

        //1. 通过传递double类型的小数来创建对象
        //但是这种方式可能不精确，因为double有时候不能精确表示小数
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1); //0.01000000000000000020816681711721685132943093776702880859375
        System.out.println(bd2); //0.0899999999999999966693309261245303787291049957275390625

        //2.通过传递字符串表示的小数来创建对象，精确
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.01");
        System.out.println(bd3); //0.01
        System.out.println(bd4); //0.01

        //通过静态方法valueOf获取BigDecimal对象
        BigDecimal bd5 = BigDecimal.valueOf(10);
        System.out.println(bd5); //10

        //细节：
        // 1.如果表示的数字不大，没有超出double的取值范围，建议使用静态方法
        // 2.如果表示的数字比较大，超出了double的取值，则建议使用构造方法
        // 3.如果我们传递的是0～10之间的整数，包含0，包含10，方法会返回已经创建好的对象，不会重新new，小数则new
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd5 == bd6); //true

        BigDecimal bd7 = BigDecimal.valueOf(10.0);
        BigDecimal bd8 = BigDecimal.valueOf(10.0);
        System.out.println(bd7 == bd8); //false

    }
}
