package com.banyuan.test2;

import java.sql.*;

/**
 * @author huangmingyang
 */
public class Login {
    public int login(User user){
        int flag=-1;
        String url="jdbc:mysql://localhost:3306/User";
        String name="root";
        String pwd="Root_123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, name, pwd);
            String sql = "select count(*) from uer where userName = ? and passWord = ? ";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,user.getUserName());
            ps.setString(2,user.getPassWord());
            ResultSet rs=ps.executeQuery();
            int count = -1;
            if (rs.next()) {
                count = rs.getInt(1);
            }if (count>0){
                return 1;
            }else{
                return 0;
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
