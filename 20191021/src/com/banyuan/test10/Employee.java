package com.banyuan.test10;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID=3049633059823371192L;
    private String name;
    private int age;
    private Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("姓名："+name+"\t");
        sb.append("年龄："+age+"\t");
        sb.append("地址-"+address+"");
        return sb.toString();
    }
}
