<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/3/22
  Time: 8:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String[] fruits = {"apple", "orange", "grape", "banana", "watermelon"};
    pageContext.setAttribute("fruits0", fruits);
%>
数组中的元素: <br>
<c:forEach var="name" items="${fruits0}">
    ${name} <br>
</c:forEach>
<hr>
<%
    Map<String, String> userMap = new HashMap<String, String>();
    userMap.put("Tom", "123");
    userMap.put("Mike", "456");
    userMap.put("Sari", "789");
%>
Map 中的元素： <br>
<c:forEach items="<%=userMap%>" var="entry">
    ${entry.key} = ${entry.value} <br>
</c:forEach>
</body>
</html>
