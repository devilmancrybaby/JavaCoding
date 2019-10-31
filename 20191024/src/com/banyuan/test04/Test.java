package com.banyuan.test04;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入学生学号：");
        Scanner scan = new Scanner(System.in);
        String stuid = scan.nextLine();
        Query.query(stuid);
    }


}