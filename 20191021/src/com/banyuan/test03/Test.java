package com.banyuan.test03;

public class Test {
    public static void main(String []args){
        Person p1=new Person();
        Person p2=new Person("嘿嘿嘿",12,"sex");

        System.out.println("员工1的信息:");
        System.out.println("name:"+p1.getName());
        System.out.println("age:"+p1.getAge());
        System.out.println("sex:"+p1.getSex());
        System.out.println("员工2的信息:");
        System.out.println("name:"+p2.getName());
        System.out.println("age:"+p2.getAge());
        System.out.println("sex:"+p2.getSex());
    }


}
