package com.company;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int a, a1;
        int sum = 0;
        System.out.println("请输入1～9个a的值: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("输入a: ");
        a = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            sum = sum + a;
            a1 = a * 10;
            a = a1;
        }
        System.out.println("sum=" + sum);
    }
}
