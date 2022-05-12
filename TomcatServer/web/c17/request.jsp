<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/9/22
  Time: 11:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("name", "Smile");
%>
${requestScope.name}<br>
</body>
</html>
