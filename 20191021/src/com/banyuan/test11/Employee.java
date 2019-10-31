package com.banyuan.test11;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
    private static final long serialVersionUID=5022956767440380940L;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("姓名: "+name+",");
        sb.append("年龄: "+age+"\n");
        return sb.toString();
    }
    public Employee clone(){
        Employee employee=null;
        try {
            employee=(Employee)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
