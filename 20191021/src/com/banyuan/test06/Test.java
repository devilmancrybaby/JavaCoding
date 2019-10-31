package com.banyuan.test06;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Cat cat1=new Cat("harry",12,33d, Color.black);
        Cat cat2=new Cat("cherish",18,32d, Color.white);
        Cat cat3=new Cat("tim",12,33d, Color.green);
        System.out.println("1号猫咪："+cat1);
        System.out.println("2号猫咪："+cat2);
        System.out.println("3号猫咪："+cat3);
    }
}
