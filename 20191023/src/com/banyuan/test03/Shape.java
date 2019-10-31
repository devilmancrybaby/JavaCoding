package com.banyuan.test03;

public abstract class Shape {
    public String getName(){
        return this.getClass().getSimpleName();
    }
    public abstract double getArea();
}
