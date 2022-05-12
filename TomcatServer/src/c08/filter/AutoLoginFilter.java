package c08.filter;

import c08.servlet.CookieUtil;
import c08.entity.UserInfo;
import c08.biz.UserInfoBiz;
import c08.biz.impl.UserInfoBizImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class AutoLoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpSession session = req.getSession();
        UserInfo user = (UserInfo)session.getAttribute("user");
        if (user != null){
            filterChain.doFilter(req, servletResponse);
        }else {
            Cookie[] cookies = req.getCookies();
            Cookie cookie = CookieUtil.findCookie(cookies, "autoLogin");
            if (cookie != null){
                UserInfoBiz ubiz = new UserInfoBizImpl();
                String name = cookie.getValue().split("#oracle#")[0];
                String pwd = cookie.getValue().split("#oracle#")[1];
                String msg = null;
                try {
                    msg = ubiz.login(name, pwd);
                } catch (SQLException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                if ("登录成功！".equals(msg))
                {
                    user = ubiz.getByName(name);
                    user.setPassword(pwd);
                    session.setAttribute("user", user);
                    filterChain.doFilter(req, servletResponse);
                }else {
                    filterChain.doFilter(req, servletResponse);
                }
            }else {
                filterChain.doFilter(req, servletResponse);
            }
        }
    }
    @Override
    public void destroy(){

    }
}
