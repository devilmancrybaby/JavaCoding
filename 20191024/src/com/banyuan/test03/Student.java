package com.banyuan.test03;

import javax.management.StringValueExp;

public class Student {
    private int id;
    private String name;
    private Score score;

    public Student(int id, String name, Score score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("学号："+id+",");
        sb.append("姓名："+name+",");
        sb.append("成绩："+score);
        return sb.toString();
    }
}
