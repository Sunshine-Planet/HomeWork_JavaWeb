<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/3/22
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="visitcount" value="1" />
<c:if test="${visitcount == 1}" var="flag">
    <h3>This is your first visit, Welcome.</h3>
</c:if>
<h3>${flag}</h3>
<h3>${visitcount}</h3>
</body>
</html>
