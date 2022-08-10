package com.chenxi.system;

public class SystemDemo01 {
    public static void main(String[] args) {
        //currentTimeMillis表示从计算机中的时间原点（1970/1/1 00:00:00，换算成北京时间1970/1/1 08:00:00）到现在的毫秒数
        //通常用于end-start time来衡量程序运行的毫秒数，判断程序运行的效率
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis); //毫秒数

        //拷贝数组
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        //把arr1数组中的值拷贝到arr2中
        //参数：（数据源，开始拷贝的index，目的地数组，目的地数组起始索引，拷贝几个数据）
        //1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则报错
        //2.拷贝数组要注意数组的长度
        //3.如果数据源数组和目的地数组都是引用数据类型，那么子类型可以赋值给父类型，引用数据类型拷贝的是对象的地址
        System.arraycopy(arr1,0,arr2,0,10);

        Student[] stu1 = new Student[3];
        Person[] person = new Person[3];
        stu1[0] = new Student("cc",12);
        stu1[1] = new Student("kk",23);
        stu1[2] = new Student("qq",15);

        System.arraycopy(stu1,0,person,0,3);

        for (int i = 0; i < person.length; i++) {
            Person p = person[i];
            System.out.println(p.getName()+" "+p.getAge());
        }

        //状态码：0 正常退出 非0：异常退出
        System.exit(0);
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
