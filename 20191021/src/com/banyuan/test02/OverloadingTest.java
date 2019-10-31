package com.banyuan.test02;

public class OverloadingTest {
    public void info(){
        System.out.println("普通方法，今天 1 岁了！");
    }

    public void info(int age){
        System.out.println("重载方法，今天 "+age+" 岁了！");
    }

    public static void main(String[] args) {
        OverloadingTest ot=new OverloadingTest();
        ot.info();
        System.out.println("==========");
        for(int i=0;i<5;i++){
            ot.info(i);
        }
    }
}
