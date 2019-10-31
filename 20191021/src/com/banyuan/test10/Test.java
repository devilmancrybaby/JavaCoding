package com.banyuan.test10;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("序列化之前：");
        Address address = new Address("中国", "江苏", "南京");
        Employee employee = new Employee("张三", 22, address);
        System.out.println("员工1 的信息");
        System.out.println(employee);

        System.out.println("序列化之后：");
        Employee employee1 = null;
        ObjectOutputStream os =null;
        ObjectInputStream is =null;
        try {
            os = new ObjectOutputStream(new FileOutputStream("./employee.dat"));
            os.writeObject(employee);
            is = new ObjectInputStream(new FileInputStream("./employee.dat"));
            employee1 = (Employee)is.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (employee1 != null) {
            employee1.getAddress().setState("中国");
            employee1.getAddress().setProvince("四川");
            employee1.getAddress().setCity("成都");
            employee1.setName("李四");
            employee1.setAge(33);
            System.out.println("员工1的信息：");
            System.out.println(employee);
            System.out.println("员工2的信息：");
            System.out.println(employee1);
        }
    }
}
