package com.banyuan.test;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个英文字符串或者解密字符串。");
        String password=sc.nextLine();
        char[] array=password.toCharArray();
        for(int i=0;i<array.length;i++){
            array[i]=(char)(array[i]^20000);
        }
        System.out.println("加密或者解密结果如下: ");
        System.err.println(new String(array));

    }
}
