<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
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

<c:forEach items="${user}" var="a" varStatus="status">
    ${status.index}: ${a}<br>
</c:forEach>
</body>
</html>
