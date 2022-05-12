<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/19/22
  Time: 9:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="c12.bean.FirstBean" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    FirstBean first = new FirstBean();
    first.setName("masn");
    first.setAge("21");

%>
<h3>姓名: <%=first.getName()%></h3>
<h3>年龄: <%=first.getAge()%></h3>
</body>
</html>
