<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/3/22
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${empty param.username}">
        unknown user!
    </c:when>
    <c:when test="${param.username == 'harry'}">
        ${param.username} is a manager.
    </c:when>
    <c:when test="${param.username == 'jack'}">
        ${param.username} is a manager.
    </c:when>
    <c:otherwise>
        ${param.username} is a visitor.
    </c:otherwise>
</c:choose>

</body>
</html>
