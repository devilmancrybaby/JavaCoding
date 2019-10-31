package com.banyuan.test04;

public class Customer {
    public static void main(String[] args) {
        System.out.println("顾客要买BMW！");
        Car bmw=CarFactory.getCar("BMW");
        System.out.println("顾客提取汽车:"+bmw.getInfo());
        System.out.println("顾客要买Benz！");
        Car benz=CarFactory.getCar("Benz");
        System.out.println("顾客提取汽车:"+benz.getInfo());
    }
}
