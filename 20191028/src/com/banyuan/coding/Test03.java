package com.banyuan.coding;

/**
 * @author huangmingyang
 */
 public class Test03 {
    private String stuNo;
    private String name;
    private float math;
    private float english;
    private float computer;
    public Test03(){

    }

    public Test03(String stuNo, String name, float math, float english, float computer) {
        this.stuNo = stuNo;
        this.name = name;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getComputer() {
        return computer;
    }

    public void setComputer(float computer) {
        this.computer = computer;
    }
    public float max(){
        float max=math;
        max=max>computer?max:computer;
        max=max>english?max:english;
        return max;

    }

    public float min(){
        float min=math;
        min=min<computer?min:computer;
        min=min<english?min:english;
        return min;

    }
}



