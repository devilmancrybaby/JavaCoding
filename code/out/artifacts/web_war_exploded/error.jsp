<%--
  Created by IntelliJ IDEA.
  User: huangmingyang
  Date: 2019-10-28
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登陆失败
<% out.print("用户名或密码错误，亲爱的: " );
    request.getParameter("username");%>
</body>
</html>
