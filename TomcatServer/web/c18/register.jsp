<%-- Created by IntelliJ IDEA. User: sunsh Date: 2022/5/12 Time: 18:15 To change this template use File | Settings |
  File Templates. --%>
  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>

    <head>
      <title>Title</title>
      <style>
        div {
          margin: auto;
          width: 60vw;
          text-align: center;
          border: 2px black solid;

        }

        form {
          margin: auto;
          width: 50%;
          text-align: left;

        }
      </style>
    </head>

    <body>
      <div>
        <form action="el_get.jsp">
          <br>
          用户名: &nbsp;<input type="text" name="username" required><br><br>
          密&nbsp;&nbsp;&nbsp;码: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="password" required><br><br>
          确认密码: &nbsp;<input type="text" name="repassword" required><br><br><br>
          电子邮箱: <input type="text" name="email" required><br><br>
          性别: <input type="radio" name="gender" value="男">男<input type="radio" name="gender" value="女">女<br><br>
          爱好: <input type="checkbox" name="hobby" value="游泳">游泳
          <input type="checkbox" name="hobby" value="旅游">旅游
          <input type="checkbox" name="hobby" value="读书">读书
          <input type="checkbox" name="hobby" value="唱歌">唱歌<br><br>
          备注: <textarea name="remark" cols="60" rows="7" required></textarea><br><br>
          <input type="submit" value="注册">&nbsp;
          <input type="reset" value="重置">
          <br><br>
        </form>
      </div>
    </body>

    </html>