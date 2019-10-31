package com.banyuan.coding;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @author huangmingyang
 * 非法访问
 */
public class IllegalAccess123 {
    public static void main(String[] args) {
        Class clazz=String.class;
        Field[] fields=clazz.getDeclaredFields();
        for (Field field:fields){
            if (field.getName().equals("hash")){
                try {
                    System.out.println(field.getInt("hash"));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }catch (IllegalArgumentException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
