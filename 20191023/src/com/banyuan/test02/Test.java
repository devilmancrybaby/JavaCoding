package com.banyuan.test02;
//方法重写
public class Test {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Manager manager=new Manager();
        employee.getInfo();
        manager.getInfo();
    }
}
