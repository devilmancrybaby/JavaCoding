package com.banyuan.mingrisoft;

import java.util.Scanner;

class CelsiusConverter {
    public double getFahrenheit(double celsius) {
        double fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println("请输入要转化的温度（单位：摄氏度）");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        CelsiusConverter cc = new CelsiusConverter();
        double fahrenheit = cc.getFahrenheit(celsius);
        System.out.println(fahrenheit);
    }
}
