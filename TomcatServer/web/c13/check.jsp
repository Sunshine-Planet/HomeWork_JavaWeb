<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/25/22
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:useBean id="reg" scope="request" class="c13.bean.Register"/>
<jsp:setProperty name="reg" property="*"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (reg.isValidate()){
%>
<jsp:forward page="success.jsp"/>
<% }else { %>
<jsp:forward page="input.jsp"/>
<% } %>
</body>
</html>
