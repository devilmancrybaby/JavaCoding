package com.banyuan.test09;

public class Test {
    public static void main(String[] args) {
        System.out.println("克隆之前！");
        Address address=new Address("中国","江苏","南京");
        Employee employee=new Employee("张建",22,address);
        System.out.println("员工 1 的信息");
        System.out.println(employee);
        System.out.println("克隆之后！");
        Employee employee1=employee.clone();
        employee1.getAddress().setState("中国");
        employee1.getAddress().setProvince("四川");
        employee1.getAddress().setCity("重庆");
        employee1.setName("刘强东");
        employee1.setAge(33);
        System.out.println("员工 1 的信息");
        System.out.println(employee);
        System.out.println("员工 2 的信息");
        System.out.println(employee1);
    }
}
