package com.chenxi.object;

public class ObjectDemo01 {
    public static void main(String[] args) {
        Object obj = new Object();

        System.out.println(obj.toString()); //java.lang.Object@4617c264 全限定类名+@+地址值
        System.out.println(obj);//效果相同：java.lang.Object@4617c264
        //因为sout默认调用object的toString方法

        //System类名
        //out静态变量
        //println()：方法
        //参数：打印的内容
        //核心逻辑：
        //当我们打印一个对象的是欧，底层会调用对象的toString方法，把对象变成字符串
        //然后再打印在控制台上，打印完毕进行换行处理

        //默认情况下，Object类中的toString方法返回的是地址值，所以打印对象就是打印对象的地址值
        //想要看到对象内部的书香，就要对toString方法进行重写
        System.out.println(obj);

        Student s1 = new Student();
        Student s2 = new Student();
        //equals默认比较的是s1和s2的地址值，底层调用的是==号进行比较
        //如果不想比较地址值，就对equals方法进行重写
        boolean res = s1.equals(s2);
        System.out.println(res);

    }
}
