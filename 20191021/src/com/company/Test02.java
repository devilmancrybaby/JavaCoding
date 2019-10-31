package com.company;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println("输入考试分数: ");
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("输入分数有误！");
                System.exit(0);
            }
            if (score >= 90) {
                System.out.println("成绩为 A !");
            } else if (score >= 80) {
                System.out.println("成绩为 B !");
            } else if (score >= 70) {
                System.out.println("成绩为 C !");
            } else if (score >= 60) {
                System.out.println("成绩为 D !");
            } else {
                System.out.println("成绩为 E !");
            }
            a = score;
        } while (a != 0);
    }
}
