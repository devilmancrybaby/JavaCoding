package com.banyuan.test08;

public class Test {
    public static void main(String[] args) {
        System.out.println("克隆之前！");
        Address ad = new Address("中国", "吉林", "长春");
        Employee employee = new Employee("张三", 12, ad);
        System.out.println("员工1信息：");
        System.out.println(employee);
        System.out.println("克隆之后");
        Employee employee1 = employee.clone();
        employee1.getAddress().setState("中国");
        employee1.getAddress().setProvince("江苏");
        employee1.getAddress().setCity("南京");
        employee1.setName("李四");
        employee1.setAge(18);
        System.out.println("员工1信息：");
        System.out.println(employee);
        System.out.println("员工2信息：");
        System.out.println(employee1);

    }
}
