package com.banyuan.coding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

/**
 * @author huangmingyang
 * 捕获多个异常
 */
public class CatchException {
    private static String URL="jdbc:mysql://localhost:3306/User";
    private static String DRIVER="com.mysql.jdbc.driver";
    private static String NAME="root";
    private static String PWD="Root_123";
    private static Connection conn;


    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            conn= DriverManager.getConnection(URL,NAME,PWD);
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        CatchException.getConnection();
    }

}
