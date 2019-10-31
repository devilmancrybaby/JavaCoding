package com.banyuan.coding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author huangmingyang
 */
public class Test11 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(3,"java",21));
        list.add(new Employee(2,"java",22));
        list.add(new Employee(1,"java",23));
        System.out.println("排序前");
        for (Employee employee:list){
            System.out.println(employee);
        }
        System.out.println("排序后");
        Collections.sort(list);
        for (Employee employee:list){
            System.out.println(employee);
        }
    }
}
