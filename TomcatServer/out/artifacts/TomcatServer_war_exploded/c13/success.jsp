<%--Title
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/25/22
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:useBean id="reg" scope="request" class="c13.bean.Register"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>
    姓名：<jsp:getProperty name="reg" property="name"/>
</h3>
<h3>
    年龄：<jsp:getProperty name="reg" property="age"/>
</h3>

</body>
</html>
