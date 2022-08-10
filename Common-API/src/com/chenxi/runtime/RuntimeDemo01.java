package com.chenxi.runtime;

import java.io.IOException;

public class RuntimeDemo01 {
    public static void main(String[] args) throws IOException {
        //通过getRuntime构造对象调用非静态方法，因为构造方法私有化，不能直接new对象
        Runtime runtime = Runtime.getRuntime();
        //获取cpu的线程数
        System.out.println(runtime.availableProcessors()); //8
        //JVM能从系统中获取总内存大小（单位byte）
        System.out.println(runtime.maxMemory()); //4294967296
        //JVM已经从系统中获取的总内存大小（单位byte）
        System.out.println(runtime.totalMemory()); //272629760
        //JVM剩余内存大小（单位byte）
        System.out.println(runtime.freeMemory());//268016952
        //运行cmd命令
        //shutdown命令
        //-s ：默认在一分钟后关机
        //-s -t：指定关机时间
        //-a：取消关机操作
        //-r：关机并重启
        runtime.exec("/usr/bin/touch /Users/ycx/Desktop/1.txt");

        //同System.exit ,因为System底层调用的就是Runtime.getRuntime().exit()
        runtime.exit(0);

    }
}
