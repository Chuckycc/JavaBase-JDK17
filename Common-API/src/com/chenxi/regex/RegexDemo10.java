package com.chenxi.regex;

public class RegexDemo10 {
    public static void main(String[] args) {
        //public String replaceAll (String regex, String newstr) 按照正则表达式的规则进行替换
        //public String[] split (String regex) 按照正则表达式的规则切割字符串

        /*
        有一段字符串：小诗诗dqwefqwfqwfwa12312小丹丹dawefqwfqwfwa12312小惠惠
        要求1：把字符串中三个姓名之间的字母替换为vs
        要求2：把宇符串中的三个姓名切割出来
                */

        String s= "小诗诗dqwefqwfqwfwq12312小月丹dqwefqwfqwfwa12312小惠惠";
        //细节：
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就用第二个参数去替换。
        String resut1 = s.replaceAll("[\\w&&[^_]]+","vs"); //小诗诗vs小月丹vs小惠惠
        System.out.println(resut1);
        String[] arr = s.split(  "[\\w&&[^ ]]+");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
