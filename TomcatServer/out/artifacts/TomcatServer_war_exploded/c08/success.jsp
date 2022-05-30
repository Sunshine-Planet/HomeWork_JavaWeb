<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 3/29/22
  Time: 8:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%--
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b" %>
--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/c08" + path +"/";
%>

<html>
<head>
    <base herf="<%=basePath%>">
    <title>欢迎页面</title>
</head>
<body>
<c:if test="${empty user}">
    <h2>您还未登录，请去<a href="login.jsp">登录</a> </h2>
</c:if>
<c:if test="${not empty user}">
    <h2>欢迎你${user.userName}</h2>
</c:if>
</body>
</html>
