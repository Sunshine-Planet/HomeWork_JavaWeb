<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/19/22
  Time: 8:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>这是 forward.jsp 页面的显示</h3>
<%
    String name = request.getParameter("name");
    out.print(name);
%>
</body>
</html>
