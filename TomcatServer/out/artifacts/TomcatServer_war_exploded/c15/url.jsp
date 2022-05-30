<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/2/22
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:url value="https://gcores.com" var="gcores">
    <c:param name="user" value="curltester"/>
    <c:param name="pwd" value="curltester"/>
</c:url>

<a href="${gcores}">访问机核</a>
</body>
</html>
