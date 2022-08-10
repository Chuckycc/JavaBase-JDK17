package com.chenxi.regex;

//字符类 只匹配一个字符
public class RegexDemo02 {
    public static void main(String[] args) {
        //public boolean matches(String regex):判断与正则表达式是否匹配，匹配返回true

        //[]
        //[adc]:只能是abc,判断单个字符
        System.out.println("---------------1--------------");
        System.out.println("a".matches("[adc]")); //true
        System.out.println("z".matches("[adc]")); //false

        //[^abc]:不能是abc，判断单个字符
        System.out.println("---------------2--------------");
        System.out.println("a".matches("[^adc]")); //false
        System.out.println("z".matches("[^adc]")); //true
        System.out.println("zz".matches("[^adc]")); //false 只能匹配单个字符
        System.out.println("zz".matches("[^adc][^adc]")); //true

        //a-z或者A-Z，包括头尾的范围，匹配单个字符
        System.out.println("---------------3--------------");
        System.out.println("a".matches("[a-zA-Z]")); //true
        System.out.println("z".matches("[a-zA-Z]")); //true
        System.out.println("aa".matches("[a-zA-Z]")); //false
        System.out.println("zz".matches("[a-zA-Z]")); //false
        System.out.println("0".matches("[a-zA-Z]")); //false

        //[a-d[m-p]] a到d 或者m-p
        System.out.println("---------------4--------------");
        System.out.println("a".matches("[a-d[m-p]]")); //true
        System.out.println("d".matches("[a-d[m-p]]")); //true
        System.out.println("m".matches("[a-d[m-p]]")); //true
        System.out.println("p".matches("[a-d[m-p]]")); //true
        System.out.println("e".matches("[a-d[m-p]]")); //false
        System.out.println("0".matches("[a-d[m-p]]")); //false

        //[a-z&&[def]]：a-z和def的交集，即为d e f
        //如果不是&&而是&，此时&不表示交集，只是&符号
        System.out.println("---------------5--------------");
        System.out.println("a".matches("[a-z&&[def]]")); //false
        System.out.println("d".matches("[a-z&&[def]]")); //true
        System.out.println("0".matches("[a-z&&[def]]")); //false

        //表示a-z或者&或者m-p
        System.out.println("&".matches("[a-z&[def]]")); //true
        System.out.println("&".matches("[a-z&&[def]]")); //false

        // [a-z&&[^bc]] a-z和非bc的交集，即[ad-z]
        System.out.println("---------------6--------------");
        System.out.println("a".matches("[a-z&&[^bc]]")); //true
        System.out.println("b".matches("[a-z&&[^bc]]")); //false
        System.out.println("0".matches("[a-z&&[^bc]]")); //false

        //[a-z&&[^m-p]] a-z和除了m-p的交集 即[a-lq-z]
        System.out.println("---------------6--------------");
        System.out.println("a".matches("[a-z&&[^m-p]]")); //true
        System.out.println("m".matches("[a-z&&[^m-p]]")); //false
        System.out.println("0".matches("[a-z&&[^m-p]]")); //false

    }
}
