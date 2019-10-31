package com.banyuan.test01;

import java.util.Date;
//继承，子类有自己的属性
public class Test {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("java");
        employee.setSalary(100);
        employee.setBirthday(new Date());
        Manager manager=new Manager();
        manager.setName("半圆学社");
        manager.setSalary(3000);
        manager.setBonus(2000);
        manager.setBirthday(new Date());
        System.out.println("员工的姓名: "+employee.getName());
        System.out.println("员工的工资: "+employee.getSalary());
        System.out.println("员工的生日: "+employee.getBirthday());
        System.out.println("经理的姓名: "+manager.getName());
        System.out.println("经理的工资: "+manager.getSalary());
        System.out.println("经理的奖金: "+manager.getBonus());
        System.out.println("经理的生日: "+manager.getBirthday());
    }
}
