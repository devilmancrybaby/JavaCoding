package com.banyuan.coding;

/**
 * @author huangmingyang
 * 类发现异常
 */
public class ClassNotFound122 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
