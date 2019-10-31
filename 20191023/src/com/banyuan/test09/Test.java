package com.banyuan.test09;
//双重锁模式
public class Test {
    public static void main(String[] args) {
        Singleton instance=Singleton.getInstance();
        instance.say();
    }
}
