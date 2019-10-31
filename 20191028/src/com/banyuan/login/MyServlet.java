package com.banyuan.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huangmingyang
 */
@WebServlet("/login")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        User user=new User(username,password);
        Login login=new Login();
        int count=login.login(user);
        if (count>0){
            req.getRequestDispatcher("success.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }


    }
}
