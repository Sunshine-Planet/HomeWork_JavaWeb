package c06;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class LogFilter implements Filter {

    private FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ServletContext context = this.config.getServletContext();
        long before = System.currentTimeMillis();
        System.out.println("开始过滤...");
        HttpServletRequest hrequest = (HttpServletRequest) servletRequest;
        context.log("Filter 已经截获到用户的请求的地址： " + hrequest.getServletPath());
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        }catch (Exception e){
            e.printStackTrace();
        }
        long after = System.currentTimeMillis();
        context.log("过滤结束");
        context.log("请求被定位到" + ((HttpServletRequest) servletRequest).getRequestURI() + "所花的时间为： " + (after - before));
    }

    @Override
    public void destroy() {

        this.config = null;
    }
}
