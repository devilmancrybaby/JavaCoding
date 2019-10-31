package com.banyuan.test;

import java.sql.*;

/**
 * @author huangmingyang
 */
public class MyDb {
    public static void upDate(int a,String username) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Root_123");
            String sql="update score set score=? where name=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,a);
            ps.setString(2,username);
            ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int getID(Score user){
        int count=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Root_123");
            String sql="select count(*) from uer where userName=? and passWord=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,user.getName());

            ps.setString(2,user.getPassword());
            ResultSet rs=ps.executeQuery();
            System.out.println(user.getName());
            System.out.println(user.getPassword());
            if (rs.next()){
                count=rs.getInt(1);
                System.out.println(count);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int getScore(String user){
        int score1=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Root_123");
            String sql="select score from Score where name=? ";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,user);

            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                score1=rs.getInt(1);
                System.out.println(score1);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return score1;
    }


}
