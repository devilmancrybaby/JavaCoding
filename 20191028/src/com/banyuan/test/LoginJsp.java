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
@WebServlet("/dengLu")
public class LoginJsp extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("userName");
        String pwd=req.getParameter("passWord");
        System.out.println(name);
        System.out.println(pwd);

        Score user=new Score();
        user.setPassword(pwd);
        user.setName(name);
        int a=MyDb.getID(user);
        System.out.println(a);
        if (a>0){
            req.getRequestDispatcher("carScore.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }

        System.out.println("================");
    }
}
