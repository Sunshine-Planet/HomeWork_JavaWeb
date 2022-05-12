<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/9/22
  Time: 10:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("username", "smile");
    request.setAttribute("pwd", "123456");
%>
姓名：${username}<br>
密码：${pwd}<br>
\${username != "" and (pwd == "asd")}<br>
${username != "" and (pwd == "asd")}<br>
\${username == "smile" and (pwd == "123456")}<br>
${username == "smile" and (pwd == "123456")}<br>

</body>
</html>
