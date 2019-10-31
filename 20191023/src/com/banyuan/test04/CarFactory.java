package com.banyuan.test04;

public class CarFactory {
    public static Car getCar(String name){
        if (name.equalsIgnoreCase("BMW")){
            return new Bmw();
        }else if(name.equalsIgnoreCase("Benz")){
            return new Benz();
        }else {
            return null;
        }
    }
}
