package com.banyuan.test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author huangmingyang
 */
public class Test06 {
    public static void main(String[] args) {
        try {
            PrintStream ps = System.out;
            //新建一个打印流对象ps 把System.out向系统输出变成控制台输出
            System.setOut(new PrintStream("eq"));
            //定向输出到文件eq 里
            System.out.println("helloworld111111");
            //将内容打印到eq文件里
            System.setIn(new FileInputStream("eq"));
            //定向写入内容 从eq文件里获取
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            System.setOut(ps);
            //重新分配输出到控制台
            System.out.println(line);
            //打印line 输出在控制台
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
