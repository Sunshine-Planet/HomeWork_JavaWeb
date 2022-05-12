<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 3/29/22
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() +"/c08" +path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录界面</title>
</head>
<body>
    <form action="doLogin" method="post">
        用户名<input name="username"><br/>
        密&nbsp;&nbsp;&nbsp;&nbsp;码<input type="password" name="pwd"><br/>
        <input type="checkbox" name="autoLogin" value="true">自动登录<br/>
        <input type="submit" value="登录">
    </form>
</body>
</html>
