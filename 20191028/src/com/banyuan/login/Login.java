package com.banyuan.login;

import java.sql.*;

/**
 * @author huangmingyang
 */
public class Login {
    public int login(User user) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/User", "root", "Root_123");
            String sql = "select count(*) from uer where userName=? and passWord=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getPwd());
            ResultSet rs = ps.executeQuery();
            int count = -1;
            while (rs.next()) {
                count = rs.getInt(1);
            }
            if (count > 0) {
                return 1;
            } else {
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
