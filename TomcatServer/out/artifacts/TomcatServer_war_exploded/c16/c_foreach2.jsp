<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/3/22
  Time: 9:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
colorlist 集合 （指定迭代的范围和步长）<br>
<%
    List<String> colorlist = new ArrayList<String>();
    colorlist.add("red");
    colorlist.add("blue");
    colorlist.add("yellow");
    colorlist.add("pink");
    colorlist.add("green");
    colorlist.add("black");
    colorlist.add("white");
    colorlist.add("brown");
%>
<c:forEach var="color" items="<%=colorlist%>" begin="2" end="6" step="2">
    ${color} &nbsp;&nbsp;
</c:forEach>
</body>
</html>
