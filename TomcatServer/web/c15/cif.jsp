<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/2/22
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${10 < 30}" var="result">
    <h3>10 比 30 小</h3>
</c:if>
<h3>${result}</h3>
</body>
</html>
