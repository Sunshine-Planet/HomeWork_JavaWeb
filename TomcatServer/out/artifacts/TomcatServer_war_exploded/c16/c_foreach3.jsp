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
<table>
<tr>
    <th>序号</th>
    <th>索引</th>
    <th>是否为第一个元素</th>
    <th>是否为最后一个元素</th>
    <th>元素的值</th>
</tr>
    <c:forEach var="color" items="<%=colorlist%>" varStatus="status">
        <tr>

            <td>${status.count}</td>
            <td>${status.index}</td>
            <td>${status.first}</td>
            <td>${status.last}</td>
            <td>${color}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
