
<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/2/22
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:set var="x" value="JSTL" scope="request"/>
    <h3>属性内容: ${x}</h3>
</body>
</html>
