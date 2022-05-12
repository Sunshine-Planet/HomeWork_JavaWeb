<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/26/22
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("a", "JSTL");
%>
<h3>
    属性存在：
    <c:out value="${a}" escapeXml="false">
    <meta http-equiv="refresh" content="0;url=http://www.zzjc.edu.cn">
    </c:out>
</h3>
<h3>属性不存在：<c:out value="${b}" default="value 为 NULL"/> </h3>
<h3>属性不存在：<c:out value="${b}">value 为 NULL</c:out> </h3>
</body>
</html>
