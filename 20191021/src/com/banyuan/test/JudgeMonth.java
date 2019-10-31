package com.banyuan.test;

import java.util.Scanner;

public class JudgeMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份: ");
        int month = sc.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("当前月份为春季！");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("当前月份为夏季！");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("当前月份为秋季！");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("当前月份为冬季！");
                break;
            default:
                System.out.println("你那有" + month + "月吗？");

        }
    }
}
