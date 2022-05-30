<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/3/22
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String str = "SMI,LE,HAPPY,GOOD";
    pageContext.setAttribute("string", str);
%>
<h3>拆分结果:</h3>
<c:forTokens items="${string}" delims="," var="con">
    ${con} &nbsp;&nbsp;
</c:forTokens>

</body>
</html>
