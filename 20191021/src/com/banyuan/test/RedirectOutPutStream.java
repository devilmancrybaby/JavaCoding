package com.banyuan.test;

import javax.print.DocFlavor;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutPutStream {
    public static void main(String[] args) {
        PrintStream out = System.out;//将向控制台输出的对象存储给out
        try {
            PrintStream ps = new PrintStream("./log.txt");//新建一个输出对象，并且改写输出到指定文件中
            System.setOut(ps);//调用setOut方法使用新建对象ps，下方打印到内容都会输出到指定文件中
            int age = 18;
            System.out.println("年龄成功定义，初始化为18。");
            String sex = "女";
            System.out.println("性别成功定义，初始化为女。");
            String info = "这是个" + sex + "孩子，应该有" + age + "岁了。";
            System.out.println("整合两个变量为info字符变量，其结果是:" + info);
            System.setOut(out);//重新将输出内容到控制台
            System.out.println("程序运行完毕，请查看日志！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
