package com.banyuan.test;

import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号: ");
        String username = sc.nextLine();
        System.out.println("请输入密码: ");
        String password = sc.nextLine();
        if (username.equals("name") && password.equals("pwd")) {
            System.out.println("登陆成功！");
        } else {
            System.out.println("账号或密码有误，登陆失败！");
        }
    }
}
