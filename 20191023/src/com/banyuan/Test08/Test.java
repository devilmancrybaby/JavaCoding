package com.banyuan.Test08;
//单例 饿汉式
public class Test {
    public static void main(String[] args) {
        //SingleObject sing=new SingleObject(); 构造函数SingleObject是不可见的
        SingleObject instance=SingleObject.getInstance();
        instance.showMessage();
    }
}
