package com.chenxi.object;

public class ObjectDemo03 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //clone方法

        //创建对象
        int[] data = {1,2,3,4,5,6,7,8,0};
        User user = new User(1,"cc","1234wsad","path1",data);
        //克隆对象
        //clone 方法是protected，只有Object类和本类中的其他子类（java.lang包下）可以直接使用
        //所以想要使用必须重写
        //方法在底层会帮我们创建一个对象，并把原来的对象的数据拷贝过去
        User user2 = (User) user.clone();

        System.out.println(user);
        System.out.println(user2);

    }
}
