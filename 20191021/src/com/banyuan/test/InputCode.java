package com.banyuan.test;

import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入身份证号：");
        String line = sc.nextLine();
        System.out.println("身份证是" + line.length() + "位数字！");
    }
}
