package com.banyuan.coding;

import java.io.Serializable;

/**
 * @author huangmingyang
 */
public class Person08 implements Serializable {
    private String name;
    private int age;

    public Person08() {
    }

    public Person08(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
