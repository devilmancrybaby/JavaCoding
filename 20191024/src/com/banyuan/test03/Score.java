package com.banyuan.test03;

public class Score {
    private double english;
    private double math;
    private double chinese;
    private double history;

    public Score(double english, double math, double chinese, double history) {
        this.english = english;
        this.math = math;
        this.chinese = chinese;
        this.history = history;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getHistory() {
        return history;
    }

    public void setHistory(double history) {
        this.history = history;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("英语："+english+",");
        sb.append("数学："+math+",");
        sb.append("语文："+chinese+",");
        sb.append("历史："+history);
        return sb.toString();
    }

}
