package com.chenxi.biginteger;

import java.math.BigInteger;

public class BigIntegerDemo02 {
    public static void main(String[] args) {

        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(3);

        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3); //13

        //除法，得到商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]); //3
        System.out.println(arr[1]); //1

        boolean res = bd1.equals(bd2);//false
        System.out.println(res);
        boolean res1 = bd1.equals(BigInteger.valueOf(10)); //true
        System.out.println(res1);

        //次幂 指数传递int类型
        System.out.println(bd1.pow(2)); //100

        //获取较大值max 不会创建新的BigInteger对象，返回较大的那个BigInteger对象
        BigInteger max = bd1.max(bd2);
        System.out.println(max); //10

        System.out.println(max == bd1); //true
        System.out.println(max == bd2); //false

        //转为int类型整数，超出int范围则报错
        BigInteger bd5 = BigInteger.valueOf(12345);
        int i = bd5.intValue();
        System.out.println(i);//12345

    }
}
