<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/2/22
  Time: 8:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="c15.bean.SmallSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:useBean id="small2" scope="page" class="c15.bean.SmallSet"/>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    SmallSet sma = new SmallSet();
    request.setAttribute("small1", sma);
%>

<c:set value="JSTL0502_1" target="${small1}" property="tent"/>
<c:set value="JSTL0502_2" target="${small2}" property="tent"/>
<h3>JavaBean 的 tent 属性(small1)： ${small1.tent}</h3>
<h3>JavaBean 的 tent 属性(small2)： ${small2.tent}</h3>
</body>
</html>
