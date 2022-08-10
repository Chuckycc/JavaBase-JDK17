package com.chenxi.math;

public class MathDemo01 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-88)); //88
        System.out.println(Math.abs(88)); //88
        /*
        bug:
        以int类型为例，取值范围：-2147483648 ～ 2147483647
        如果没有正数与复数对应，传递的负数结果有误
        -2147483648在int的取值范围内没有正数与之对应，所以abs结果产生bug
         */
        System.out.println(Math.abs(-2147483648)); //-2147483648

        //System.out.println(Math.absExact(-2147483648)); //会有报错提示

        //向上取整（进一法） 向正无穷大方向获取距离最近的整数
        System.out.println(Math.ceil(12.34)); //13.0
        System.out.println(Math.ceil(12.54)); //13.0
        System.out.println(Math.ceil(-12.34)); //-12.0
        System.out.println(Math.ceil(-12.54)); //-12.0

        //向下取整（去尾法）向父无穷大方向获取距离最近的整数
        System.out.println(Math.floor(12.34)); //12.0
        System.out.println(Math.floor(12.54)); //12.0
        System.out.println(Math.floor(-12.34)); //-13.0
        System.out.println(Math.floor(-12.54)); //-13.0

        //四舍五入
        System.out.println(Math.round(12.34)); //12
        System.out.println(Math.round(12.54)); //13
        System.out.println(Math.round(-12.34)); //-12
        System.out.println(Math.round(-12.54)); //-13

        //获取两个整数的较大值
        System.out.println(Math.max(20,30)); //30

        //获取两个整数的较小值
        System.out.println(Math.min(20,30)); //20

        //pow(a,b):a的b次幂
        //pow函数的b参数还是尽量传递大于1的正整数
        System.out.println(Math.pow(2, 3)); //8.0
        System.out.println(Math.pow(4, 0.5)); //2.0
        System.out.println(Math.pow(2, -2)); //0.25

        //开平方
        System.out.println(Math.sqrt(4)); //2.0
        //开立方
        System.out.println(Math.cbrt(8)); //2.0

        //获取随机数,范围是[0.0,1.0)
        System.out.println(Math.random());

    }

}
