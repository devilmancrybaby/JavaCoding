package com.banyuan.test05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//改写compareTo方法，通过id进行排序
public class Test {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(1,"joker",12));
        list.add(new Employee(3,"harry",32));
        list.add(new Employee(2,"cherish",25));
        System.out.println("排序前: ");
        for(Employee employee:list){
            System.out.println(employee);
        }
        System.out.println("排序后: ");
        Collections.sort(list);
        for(Employee employee:list){
            System.out.println(employee);
        }
    }
}
