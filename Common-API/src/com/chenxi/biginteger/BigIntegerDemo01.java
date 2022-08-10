package com.chenxi.biginteger;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo01 {
    public static void main(String[] args) {
        //BigInteger对象一旦创建，里面的数据不会发生改变

        //获取一个随机的大整数
        BigInteger bd1 = new BigInteger(4,new Random());
        System.out.println(bd1);

        //获取一个指定的大整数(传入的字符串只能是整数)
        BigInteger bd2 = new BigInteger("12345667643322");
        System.out.println(bd2);

        //获取指定进制的大整数，第二个参数指定进制
        //字符串中的额数字必须要和进制吻合，且是整数
        BigInteger bd3 = new BigInteger("454124342", 16);
        BigInteger bd4 = new BigInteger("0110011011", 2); //二进制只能是01字符串
        System.out.println(bd3); //18590352194 打印的结果都是10进制的
        System.out.println(bd4); //411

        //静态方法获取BigInteger的对象
        //1.能表示的范围比较小，参数取值在long的取值范围内
        //2.在内部对常用的数字进行了优化了-16～16范围内的整数
        //提前把-16～16范围内的整数的BigInteger的对象，如果多次获取不会创建新的
        BigInteger bd5 = BigInteger.valueOf(8);
        BigInteger bd6 = BigInteger.valueOf(8);
        System.out.println(bd5);
        System.out.println(bd5 == bd6); //true

        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8); //false

        //只要进行计算都会产生一个新的BigInteger对象
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        BigInteger res = bd9.add(bd10);
        System.out.println(res);
    }
}
