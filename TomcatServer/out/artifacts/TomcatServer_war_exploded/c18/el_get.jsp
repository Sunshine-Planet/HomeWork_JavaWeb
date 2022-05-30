<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: sunsh
  Date: 2022/5/12
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
            text-align: center;
            margin: auto;
        }

        table,
        td {
            border: 1px black solid;
        }

        td:nth-child(odd) {
            width: 10vw;
            text-align: center;
        }

        td:nth-child(even) {
            width: 20vw;
            text-align: left;
        }
    </style>
</head>
<body>
<c:if test="${param.password == param.repassword}" var="pwdChecker"/>
<c:if test="${pwdChecker == false}">
    <h3>两次密码输入有误</h3><br>
    <a href="register.jsp">返回</a>
</c:if>
<c:if test="${pwdChecker == true}">
    <table>
        <tr>
            <td>用户名</td>
            <td>&nbsp;${param.username}</td>
        </tr>
        <tr>
            <td>密码</td>
            <td>&nbsp;${param.password}</td>
        </tr>
        <tr>
            <td>电子邮箱</td>
            <td>&nbsp;${param.email}</td>
        </tr>
        <tr>
            <td>性别</td>
            <td>&nbsp;${param.gender}</td>
        </tr>
        <tr>
            <td>爱好</td>
            <td>
                <c:forEach var="hobby" items="${paramValues.hobby}">
                    &nbsp;${hobby}&nbsp;
                </c:forEach>
            </td>
        </tr>
        <tr>
            <td>备注</td>
            <td>&nbsp;${param.remark}</td>
        </tr>
        <tr>
            <td colspan="2"><a href="register.jsp">返回</a></td>
        </tr>
    </table>


</c:if>


</body>
</html>
