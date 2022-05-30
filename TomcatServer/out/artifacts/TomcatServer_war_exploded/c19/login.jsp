<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/17/22
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h2>MVC 设计登录程序</h2>
<script>
    function validate(f){
        if (!(/^\w{5,15}$/.test(f.userid.value))){
            alert("用户 ID 必须是 5~15 位! ");
            f.userid.focus();
            return false;
        }
        if (!(/^\w{5,15}$/.test(f.userpass.value))){
            alert("密码必须是 5~15 位! ");
            f.userpass.focus();
            return false;
        }
    }
</script>
<%
    request.setCharacterEncoding("UTF-8");
%>
<%
    List<String> info = (List<String>) request.getAttribute("info");
    if (info != null){
        Iterator<String> iter = info.iterator();
        while (iter.hasNext()){
%>
    <h4><%=iter.next()%></h4>
<%
    }
    }
%>
<form action="/c19/login" method="post" onsubmit="validate(this)">
    用户 ID:<input type="text" name="userid"><br>
    密&nbsp;&nbsp;&nbsp;&nbsp;码<input type="password" name="userpass"><br>
    <input type="submit" value="登录">
    <input type="reset" value="重置">

</form>
</body>
</html>
