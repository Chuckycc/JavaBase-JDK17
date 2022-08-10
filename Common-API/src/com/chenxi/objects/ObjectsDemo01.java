package com.chenxi.objects;

import java.util.Objects;

public class ObjectsDemo01 {
    public static void main(String[] args) {
        //Student s1 = new Student("FF",23);
        Student s1 = null;
        Student s2 = new Student("dd", 14);

        //1.先判断s1是否为null，如果为null直接返回false
        //2.如果s1不为null，那么就再次用s1调用equals方法进行比较
        //3.如果s1是Student类型，那么就调用Student方法的equals
        boolean res = Objects.equals(s1, s2); //false
        System.out.println(res);

        //判断对象是否为null，为null返回true，反之
        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3)); //false
        System.out.println(Objects.isNull(s4)); //true;

        System.out.println(Objects.nonNull(s3));//true
        System.out.println(Objects.nonNull(s4));//false


    }
}
