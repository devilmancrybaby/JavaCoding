package com.banyuan.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数:");
        int number = sc.nextInt();
        String flag=number % 2 == 0 ? "number为整数" : "number为奇数";
        System.out.println(flag);
    }
}
