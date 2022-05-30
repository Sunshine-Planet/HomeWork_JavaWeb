<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/9/22
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String[] str = {"S", "M", "I", "L", "E"};
    request.setAttribute("user", str);
%>
<%
    //String[] str1 = (String[]) request.getAttribute("user");
    for (int i = 0; i < str.length; i++){
        request.setAttribute("rt", i);
%>
${rt}: ${user[rt]}<br>
<%
    }
%>
</body>
</html>
