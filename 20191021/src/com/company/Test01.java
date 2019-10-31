package com.company;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入年份: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //&& (逻辑与/并且) 优先级高于||（逻辑或）
        if (year < 0 || year > 3000) {
            System.out.println("输入年份有问题。");
            System.exit(0);//数值0正常退出，数值1非正常退出
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("当前年份为闰年！");
        } else {
            System.out.println("当前年份不为闰年");
        }
    }
}
