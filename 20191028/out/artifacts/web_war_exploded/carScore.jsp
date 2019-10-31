<%--
  Created by IntelliJ IDEA.
  User: huangmingyang
  Date: 2019-10-29
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="score" method="get">
    姓名<input type="text" name="username" value="">
    <br />
    违规行为<select name="score">
    <option value="a" name="score1">1</option>
    <option value="b" name="score2">2</option>
    <option value="c" name="score3">3</option>
</select>
    <br />
    <input type="submit" value="提交">

</form>
</body>
</html>
