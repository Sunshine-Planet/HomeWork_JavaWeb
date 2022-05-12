package c08.servlet;

import c08.entity.UserInfo;
import c08.biz.UserInfoBiz;
import c08.biz.impl.UserInfoBizImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

public class DoLoginServlet extends HttpServlet {

    public DoLoginServlet(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String name = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        String autoLogin = req.getParameter("autoLogin");
        UserInfoBiz ubiz = new UserInfoBizImpl();
        String msg = null;
        try {
            msg = ubiz.login(name, pwd);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if ("登录成功！".equals(msg)){
            UserInfo user = ubiz.getByName(name);
            //不然这个 user 没被赋值密码啊
            user.setPassword(pwd);
            session.setAttribute("user", user);
            //勾选自动登录时
            if ("true".equals(autoLogin)){
                Cookie cookie = new Cookie("autoLogin", user.getuserName() + "#oracle#" + user.getPassword());
                cookie.setMaxAge(60*60*24);
                resp.addCookie(cookie);
            }
            resp.sendRedirect("success.jsp");
        } else {
            req.setAttribute("msg", msg);
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }

    public void init() throws ServletException{
    }

    public void destroy() {
        super.destroy();
    }
}
