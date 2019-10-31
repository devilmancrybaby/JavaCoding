package com.mingrisoft;

public class Test {
    public static void main(String[] args) {
        System.out.println("创建皇帝 1 对象。");
        Emperor emperor1 = Emperor.getInstance();
        emperor1.getName();
        System.out.println("创建皇帝 2 对象。");
        Emperor emperor2 = Emperor.getInstance();
        emperor2.getName();
        System.out.println("创建皇帝 3 对象。");
        Emperor emperor3 = Emperor.getInstance();
        emperor3.getName();
    }
}
