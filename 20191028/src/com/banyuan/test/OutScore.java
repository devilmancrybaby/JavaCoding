package com.banyuan.test;

import java.sql.*;

/**
 * @author huangmingyang
 */
public class OutScore {
    public static void outScore(String username,int score){
        String url="jdbc:mysql://localhost:3306/User";
        String name="root";
        String pwd="Root_123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,name,"Root_123");
            String sql="insert into outScore(name ,score) value(?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setInt(2,score);
            ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
