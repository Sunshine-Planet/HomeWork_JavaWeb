<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/11/22
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>属性监听器</title>
</head>
<body>
<%
    //getServletContext().setAttribute("username", "abc");
    //getServletContext().setAttribute("username", "def");
    //getServletContext().removeAttribute("username");
    application.setAttribute("username", "ghi");
    application.setAttribute("username", "jkl");
    application.removeAttribute("username");
    request.setAttribute("user", "harry");
    request.setAttribute("user", "hang");
    request.removeAttribute("user");
    session.setAttribute("pwd", "root");
    session.setAttribute("pwd", "123456");
    session.removeAttribute("pwd");

%>
</body>
</html>
