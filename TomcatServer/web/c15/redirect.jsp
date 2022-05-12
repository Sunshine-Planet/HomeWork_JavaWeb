<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/2/22
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:redirect url="param1.jsp">
    <c:param name="user" value="smile"/>
    <c:param name="url" value="https://gcores.com"/>
</c:redirect>
</body>
</html>
