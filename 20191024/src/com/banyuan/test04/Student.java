package com.banyuan.test04;

public class Student {
    private String id;
    private String name;
    private double English;
    private double Math;
    private double Chinese;
    private double history;
    private double politics;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getEnglish() {
        return English;
    }

    public double getMath() {
        return Math;
    }

    public double getChinese() {
        return Chinese;
    }

    public double getHistory() {
        return history;
    }

    public double getPolitics() {
        return politics;
    }

    public Student(String id, String name, double english, double math, double chinese, double history, double politics) {
        this.id = id;
        this.name = name;
        English = english;
        Math = math;
        Chinese = chinese;
        this.history = history;
        this.politics = politics;
    }

}