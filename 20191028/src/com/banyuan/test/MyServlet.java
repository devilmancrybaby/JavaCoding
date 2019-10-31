package com.banyuan.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huangmingyang
 */
@WebServlet("/score")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a=req.getParameter("score");
        String name=req.getParameter("username");
        System.out.println("_+_+_+_+_+_+_+");
        System.out.println(name);
        Score score=new Score(name,a);

        int lg=Login.score(score);

        //往数据库 存储扣分记录以及人名
        OutScore.outScore(name,lg);
        Login login=new Login();
        int getOldScore=login.getOldScore(name);
        int newScore=login.newScore(getOldScore,lg);
        System.out.println("--------");
        System.out.println(lg);
        Score user=new Score();
        System.out.println(user.getName());
        int newScore1=MyDb.getScore(name);
        req.setAttribute("score",lg);
        req.setAttribute("newScore",newScore1);
        System.out.println("+++++______");
        System.out.println(newScore1);
        req.getRequestDispatcher("success.jsp").forward(req,resp);


        //更新扣分之后的驾证分
        MyDb.upDate(newScore,name);
        System.out.println("+++++++++++++++++");


    }
}
