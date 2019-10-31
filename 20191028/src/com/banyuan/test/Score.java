package com.banyuan.test;

/**
 * @author huangmingyang
 */
public class Score {
    private int id;
    private String name;
    private String score;
    private long phone;
    private String password;


    public Score(String name, String score) {
        this.name = name;
        this.score = score;
    }

    public Score() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Score(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
