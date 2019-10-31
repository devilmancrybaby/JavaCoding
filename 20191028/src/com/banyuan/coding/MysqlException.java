package com.banyuan.coding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author huangmingyang
 * 数据库操作异常
 */
public class MysqlException {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/User";
        String driver="com.mysql.jdbc.Driver";
        String name="root";
        String pwd="Root_123";
        Connection conn=null;
        try {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,name,"");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
