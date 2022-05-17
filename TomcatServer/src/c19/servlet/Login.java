package c19.servlet;

import c18.factory.DAOFactory;
import c19.vo.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "/c19/login.jsp";
        String userid = req.getParameter("userid");
        String userpass = req.getParameter("userpass");
        List<String> info = new ArrayList<String>();
        if (userid == null || "".equals(userid)){
            info.add("用户 id 不能为空! ");
        }
        if (userpass == null || "".equals(userpass)){
            info.add("密码不能为空! ");
        }
        if (info.size() == 0){
            User user = new User();
            user.setUserid(userid);
            user.setPassword(userpass);
            try{
                if (DAOFactory.getIUserDAOInstance().findLogin(user)){
                    info.add("用户登录成功, 欢迎 " + user.getName() + " 光临!");
                }else {
                    info.add("用户登录失败, 错误的用户名和密码! ");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        req.setAttribute("info", info);
        req.getRequestDispatcher(path).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
