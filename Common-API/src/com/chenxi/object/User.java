package com.chenxi.object;

import java.util.Arrays;

//Cloneable
//如果一个类没有抽象方法，代表当前类是一个标记性接口
//实现了Cloneable接口，就表示当前类的对象可以背克隆
//如果没有实现Cloneable接口，就表示当前类的对象不可以被克隆
public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;

    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", path='" + path + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法，相当于让Java克隆一个对象，并把之后的对象返回
        return super.clone();
    }

    protected void print(){
        System.out.println("print");
    }
}
