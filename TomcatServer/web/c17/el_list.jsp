<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/9/22
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> list = new ArrayList<String>();
    list.add("S");
    list.add("M");
    list.add("ILE");
    session.setAttribute("user", list);
%>
<c:forEach items="${user}" var="i" varStatus="status">
    ${status.index}: ${i}<br>
</c:forEach>
</body>
</html>
