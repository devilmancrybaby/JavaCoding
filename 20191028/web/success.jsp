<%--
  Created by IntelliJ IDEA.
  User: huangmingyang
  Date: 2019-10-28
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登陆成功！
<form   method="post">

    <%=request.getParameter("username")%>
    <input name="successName" value="${score}">
    <input name="newScore" value="${newScore}">
</form>
</body>
</html>
