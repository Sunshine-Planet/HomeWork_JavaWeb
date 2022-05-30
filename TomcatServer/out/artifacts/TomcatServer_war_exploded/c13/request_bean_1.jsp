<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/25/22
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="count" scope="request" class="c13.bean.Count"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>This is request_bean_1.jsp</h3>
<h3>访问次数：<jsp:getProperty name="count" property="count"/></h3>
</body>
</html>
