package com.banyuan.test;

import java.sql.*;

/**
 * @author huangmingyang
 */
public class Login {

    public int getOldScore(String username) {
        int count=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/User", "root", "Root_123");
            String sql = "select score from Score where name=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                count = (int) rs.getObject(1);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int newScore(int oldScore,int score) {
        int newScores = 0;
        newScores = oldScore + score;
        return newScores;
    }

    public static int score(Score score) {
        if ("a".equals(score.getScore())) {
            return -3;
        } else if ("b".equals(score.getScore())) {
            return -6;
        } else if (score.getScore().equals("c")) {
            return -12;
        }
        return 0;
    }

}
