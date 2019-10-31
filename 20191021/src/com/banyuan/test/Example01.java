package com.banyuan.test;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("员工姓名:");
        String name = sc.nextLine();
        System.out.println("编程语言:");
        String language = sc.nextLine();
        switch (language.hashCode()) {
            case 3254818:
            case 2301506:
            case 2269730:
                System.out.println("员工" + name + "被分配到java程序开发部门。");
                break;
            case 3104:
            case 2112:
                System.out.println("员工" + name + "被分配到C#项目维护组。");
                break;
            case -709190099:
            case 955463181:
            case 9745901:
                System.out.println("员工" + name + "被分配到Asp.net程序测试部门。");
                break;
            default:
                System.out.println("公司不需要" + language + "语言程序开发人员。");
        }
    }
}
