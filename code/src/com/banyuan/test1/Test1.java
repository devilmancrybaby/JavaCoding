package com.banyuan.test1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author huangmingyang
 */
public class Test1 {
    /**
     *
     * @return
     */
    //创建连接
    public static Connection getConnection() {
        Connection conn = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //创建连接

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_0915", "root", "Root_123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     *
     * @param rs
     * @param s
     * @param conn
     */
    //关闭
    public static void closeAll(ResultSet rs, Statement s, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (s != null) {
            try {
                s.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}