
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎页面</title>
    <style>
        body{
            text-align: center;
            color: darkorange;
        }
    </style>
</head>
<body>
<%
    String name = (String) session.getAttribute("username");
%>

<h1>欢迎你, <%=name%></h1>
<p>登录成功</p>
<p>愿她的肺永远绽放金色光芒</p>
</body>
</html>
