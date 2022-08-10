package com.chenxi.regex;

public class RegexDemo05 {
    public static void main(String[] args) {
        //正则表达式练习：
        //需求
        //请编写正则表达式验证用户名是否满足要求。
        //要求：大小写字母，数宇，下划线一共4-16位
        //请编写正则表达式验证身份证号码是否满足要求。
        //简单要求：18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        //复杂要求：按照身份证号码的格式严格要求。
        //身份证号码：
        //41080119930228457x
        //510801197609022309
        //15040119810705387X
        //130133197204039024
        //430102197606046442

        //用户名要求：大小写字母，数宇，下划线一共4-16位
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1)); //true
        System.out.println("lisi".matches(regex1)); //true
        System.out.println("wangwu".matches(regex1)); //true
        System.out.println("$123".matches(regex1)); //false
        System.out.println("-------------------------");


        //身份证号码的严格校验
        //编写正则的小心得：
        //第一步：按照正确的数据进行拆分
        //第二步：找每一部分的規律，并编写正则表达式
        //第三步：把每一部分的正则拼接在一起，就是最终的结果
        //书写的时候：从左到右去书写。
        //419891 1993 9228 457x
        //前面6位：省份，市区，派出所等信息 第一位不能是日，后面5位是任意数字 ：[1-9]\\d{5}
        //年的前半段 18 19 20 ：(18|19|20)
        //年的后半段：任意数字出现两次：\\d{2}
        //月份  01 ~ 09 10 11 12 :(0[1-9]|1[0-2])
        //日期  01 ~ 09 10~19 20~29 30 31：(0[1-9]|[12]\\d|3[01])
        //后面4位：任意数字出现3次 最后一位可以是数字也可以是大写x或 者小写X ：\\d{3}[\\dXx]
        String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("41080119930228457x".matches(regex6)); //true
        System.out.println("510801197609022309".matches(regex6));//true
        System.out.println("15040119810705387X".matches(regex6));//true
        System.out.println("130133197204039024".matches(regex6));//true
        System.out.println("430102197606046442".matches(regex6));//true
    }
}