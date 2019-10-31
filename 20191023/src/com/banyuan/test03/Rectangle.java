package com.banyuan.test03;

public class Rectangle extends Shape {
    private double length;
    private double weight;
    public Rectangle(double length,double weight){
            this.length=length;
            this.weight=weight;
    }
    @Override
    public double getArea() {
        return length*weight;
    }
}
