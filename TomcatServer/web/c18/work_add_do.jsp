<%@ page import="c18.vo.Worker" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="c18.factory.DAOFactory" %>

<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/16/22
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <% request.setCharacterEncoding("UTF-8");%>
</head>
<body>
<%
    Worker work = new Worker();
    work.setEmpno(Integer.parseInt(request.getParameter("empno")));
    work.setEname(request.getParameter("ename"));
    work.setJob(request.getParameter("job"));
    work.setHiredate(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("hiredate")));
    work.setSal(Float.parseFloat(request.getParameter("sal")));
    try{
    if (DAOFactory.getIWorkerDAOInstance().doCreate(work)){
%>
    <h3>信息添加成功!</h3>
<%
    }else {
%>
    <h3>信息添加失败!</h3>
<%
    }
%>
<%
    }
    catch(Exception e){
        e.printStackTrace();
    }
%>
</body>
</html>
