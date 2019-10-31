package com.banyuan.test2;

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
        String name=req.getParameter("username");
        String pwd=req.getParameter("password");
        User user= new User(name,pwd);
        Login lg=new Login();
        int result=lg.login(user);
        System.out.println(result);
        if (result>0){
            System.out.println("success");
            resp.sendRedirect("success.jsp");
        }else{
            System.out.println("error");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
