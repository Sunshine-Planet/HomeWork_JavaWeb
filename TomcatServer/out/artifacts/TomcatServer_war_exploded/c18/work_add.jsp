<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/16/22
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="work_add_do.jsp" method="post">
    编号:<input type="text" name="empno"><br>
    姓名:<input type="text" name="ename"><br>
    职位:<input type="text" name="job"><br>
    工作日期:<input type="text" name="hiredate"><br>
    工资:<input type="text" name="sal"><br>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>
</body>
</html>
