package com.chenxi.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo02 {
    public static void main(String[] args) {

        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(2.0);

        //加法
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3); //12.0

        //减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4); //8.0

        //乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5); //5.0

        //除法:可以除尽时
        BigDecimal bd6 = bd1.divide(bd2);
        System.out.println(bd6); //5

        //除法：除不尽时，要设置保留的位数和保留的方式
        //RoundingMode.HALF_UP为四舍五入
        BigDecimal bd7 = BigDecimal.valueOf(3.0);
        BigDecimal bd8 = bd1.divide(bd7, 2, RoundingMode.HALF_UP);
        System.out.println(bd8); //3.33

    }
}
