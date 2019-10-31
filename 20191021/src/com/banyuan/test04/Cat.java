package com.banyuan.test04;

import java.awt.*;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private Color color;

    public Cat(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (getClass()!=obj.getClass()){
            return false;
        }
        Cat cat=(Cat)obj;
        return name.equals(cat.name)&&(age==cat.age)&&(weight==cat.weight)&&color.equals(cat.color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }
}
