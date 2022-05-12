<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/19/22
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="first" scope="page" class="c12.bean.FirstBean"/>
<jsp:setProperty name="first" property="age" param="name"/>
<jsp:setProperty name="first" property="name" param="age"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>姓名: <jsp:getProperty name="first" property="name"/></h3>
<h3>年龄: <jsp:getProperty name="first" property="age"/></h3>
</body>
</html>
