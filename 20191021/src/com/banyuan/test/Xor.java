package com.banyuan.test;

import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入整数A:");
        int a = sc.nextInt();
        System.out.println("输入整数B:");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("A=" + a);
        System.out.println("B=" + b);

    }
}
