package com.banyuan.test1;

import com.banyuan.test1.Test3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author huangmingyang
 */
public class Test3 {
    /**
    *
    * static
    *
     */
    public static int  query(Test4 login) {
        //获取连接
        Connection conn = Test1.getConnection();
        ResultSet rs=null;
        PreparedStatement ps=null;

        int count=0;
        try {
            String sql = "select count(*) from user1 where userName=? and passWord=?";
            //创建sql语句
            ps = conn.prepareStatement(sql);
            ps.setString(1, login.getName());
            ps.setString(2, login.getPwd());
            rs = ps.executeQuery();
            while (rs.next()) {
                count=rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Test1.closeAll(rs,ps,conn);
        }
        return count;
    }
}