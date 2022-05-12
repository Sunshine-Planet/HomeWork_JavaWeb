<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/9/22
  Time: 9:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
请求的 URL ： ${pageContext.request.requestURI}<br>
Content - Type 响应头是： ${pageContext.response.contentType}<br>
服务器信息： ${pageContext.servletContext.serverInfo}<br>
Servlet 的注册信息： ${pageContext.servletConfig.servletName}<br>
</body>
</html>
