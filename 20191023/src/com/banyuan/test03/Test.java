package com.banyuan.test03;
//抽象类的使用，重写抽象方法
public class Test {
    public static void main(String[] args) {
        Circle cc=new Circle(2);
        Rectangle rt=new Rectangle(2,3);
        System.out.println("图形面积是: "+cc.getArea());
        System.out.println("图形面积是: "+rt.getArea());
    }

}
