<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/10/22
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="small" scope="page" class="c15.bean.SmallSet"/>
<jsp:setProperty name="small" property="tent" value="pageScope"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
${pageScope.small.tent}
</body>
</html>
