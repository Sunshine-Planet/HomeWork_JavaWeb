<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/9/22
  Time: 11:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    application.setAttribute("name", "Smile");
%>
${applicationScope.name}
</body>
</html>
