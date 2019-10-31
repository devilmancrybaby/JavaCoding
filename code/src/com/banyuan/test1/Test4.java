package com.banyuan.test1;

/**
 * @author huangmingyang
 */
public class Test4 {
    private  String name ;
    private String pwd;
    public Test4(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}