package com.banyuan.test09;

public class Singleton {
    private Singleton(){}
    private static volatile Singleton instance=null;
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void say(){
        System.out.println("独孤九剑-天下第一！");
    }
}
