package c05;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String passwd = req.getParameter("passwd");
        if ("哈里".equals(username) && ("123456").equals(passwd)){
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            resp.sendRedirect("/c06/welcome.jsp");
        }else resp.sendRedirect("/c05/login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
