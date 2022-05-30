<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/25/22
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:useBean id="reg" scope="request" class="c13.bean.Register"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="check.jsp" method="post">
    <h3>
        姓名：
        <input type="text" name="name" value="<jsp:getProperty name="reg" property="name"/>">
        <%=reg.getErrorMsg("errname") %>
    </h3><br>
    <h3>
        年龄：
        <input type="text" name="age" value="<jsp:getProperty name="reg" property="age"/>">
        <%=reg.getErrorMsg("errage") %>
    </h3><br>
    <input type="submit" value="注册">
    <input type="reset" value="重置">
</form>
</body>
</html>
