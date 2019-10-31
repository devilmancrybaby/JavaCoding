package com.banyuan.test11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<Employee>();
        Employee employee=new Employee("李四",22);
        long currentTime=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            employees.add(employee.clone());
        }
        System.out.println("克隆花费时间："+(System.currentTimeMillis()-currentTime)+"毫秒");
        currentTime=System.currentTimeMillis();
        ObjectOutputStream os=null;
        for (int i=0;i<100000;i++){
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            try {
                os=new ObjectOutputStream(bos);
                os.writeObject(employee);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream is=null;
            try {
                is=new ObjectInputStream(bis);
                employees.add((Employee) is.readObject());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("序列化花费时间："+(System.currentTimeMillis()-currentTime)+"毫秒");
    }
}
