<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/9/22
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("user", "");
    request.setAttribute("user1", null);
    request.setAttribute("user2", 2);
%>
${empty user}<br>
${empty user1}<br>
${empty user2}<br>
</body>
</html>
