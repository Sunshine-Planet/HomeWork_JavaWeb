<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/12/22
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- jsp 指令标签，定义当前页面属性-->
<%@ page import="java.util.Date" %>
<html>
<head>
    <title>JSP 页面基本结构</title>
</head>
<body bgcolor="#faebd7"><font size="4">
<%!
    Date date;
    int sum;
    public int add(int a, int b){
        return a + b;
    }
%>
    <%
        //创建日期对象
        date =new Date();
        out.print("<br>" + date);
        sum = add(123, 345);

    %>
    <%--加法的结果 --%>
    <br><h3>在下一行输出累加和：</h3><br>
    <%=sum + 500%>

</font>
</body>
</html>
