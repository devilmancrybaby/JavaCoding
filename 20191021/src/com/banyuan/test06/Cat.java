package com.banyuan.test06;

import java.awt.*;

public class Cat {
    private String name;
    private int age;
    private Double weight;
    private Color color;

    public Cat(String name,int age,Double weight,Color color){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("名字："+name+"\n");
        sb.append("年龄："+age+"\n");
        sb.append("重量："+weight+"\n");
        sb.append("颜色："+color+"\n");
        return sb.toString();
    }

}
