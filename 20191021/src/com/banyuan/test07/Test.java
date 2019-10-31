package com.banyuan.test07;

public class Test {
    public static void main(String[] args) {
        Employee ee=new Employee();
        ee.setAge(12);
        ee.setName("yee");
        System.out.println(ee);
        Employee ee1=ee;
        ee1.setName("harry");
        ee1.setAge(18);
        System.out.println(ee1);
        System.out.println(ee);
    }
}
