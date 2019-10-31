
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% out.println("用户登陆"); %>
<form action="login" method="post">
    请输入账号: <input type="text" name="userName" value="" id="userName_id">
    <br />
    请输入密码: <input type="password" name="password" value="" id="password_id">
    <br />
    <input type="submit" value="登陆">
</form>
</body>
</html>
