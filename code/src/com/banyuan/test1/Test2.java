package com.banyuan.test1;

import com.banyuan.test1.Test1;
import com.banyuan.test1.Test3;
import com.banyuan.test1.Test4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huangmingyang
 */
@WebServlet("/Login")
public class Test2 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
        Test4 login = new Test4(name, pwd);
        int count = Test3.query(login);
        if (count > 0) {
            System.out.println("登录成功");
            request.setAttribute("username", name);
            request.getRequestDispatcher("success.jsp").forward(request, response);
        } else {
            System.out.println("登录失败");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}