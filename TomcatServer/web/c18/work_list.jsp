<%@ page import="java.util.List" %>
<%@ page import="c18.vo.Worker" %>
<%@ page import="c18.factory.DAOFactory" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 5/17/22
  Time: 8:42 AM
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
    String keyWord = request.getParameter("kw");
    if (keyWord == null){
        keyWord = "";
    }
    List<Worker> all = DAOFactory.getIWorkerDAOInstance().findAll(keyWord);
    Iterator<Worker> iter = all.iterator();
%>
<div style="text-align: center;">
    <form action="work_list.jsp" method="post">
        查询关键字:<input type="text" name="kw">
        <input type="submit" value="查询">
    </form>
    <table>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>工作</td>
            <td>工作日期</td>
            <td>工资</td>
        </tr>
        <%
            while (iter.hasNext()){
                Worker work = iter.next();

        %>
        <tr>
            <td><%=work.getEmpno()%></td>
            <td><%=work.getEname()%></td>
            <td><%=work.getJob()%></td>
            <td><%=work.getHiredate()%></td>
            <td><%=work.getSal()%></td>
        </tr>
        <%
            }
        %>
    </table>
</div>
</body>
</html>
