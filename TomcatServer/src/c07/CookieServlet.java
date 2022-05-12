package c07;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("name", "harry");
        cookie.setMaxAge(24*3600);
        resp.setContentType("text/html;charset=utf-8");
        resp.addCookie(cookie);
        PrintWriter out=resp.getWriter();
        Cookie[] cookies= req.getCookies();
        if (cookies==null){
            out.println("还没有 Cookie");
        }else {
            out.println("Cookie 列表");
            for (int i = 0; i < cookies.length; i++){
                out.println("Cookie Name: " + cookies[i].getName()+"<br>");
                out.println("Cookie Value" + cookies[i].getValue());
                out.println("<br>");
            }
        }
    }
}
