package com.banyuan.test05;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Cat cat1=new Cat("java",12,21,Color.black);
        Cat cat2=new Cat("c++",12,21,Color.white);
        Cat cat3=new Cat("java",12,21,Color.black);

        System.out.println("输出1号猫咪哈西马："+cat1.hashCode());
        System.out.println("输出2号猫咪哈西马："+cat2.hashCode());
        System.out.println("输出3号猫咪哈西马："+cat3.hashCode());

        System.out.println("比较1号跟2号猫咪是否相同："+cat1.equals(cat2));
        System.out.println("比较1号跟2号猫咪是否相同："+cat1.equals(cat3));
    }
}

