package c06;

import jakarta.servlet.*;

import java.io.IOException;

public class FilterDemo1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FilterDemo1 init 被调用");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterDemo1，客户端 servlet 请求已拦截");
        filterChain.doFilter(request, response);
        System.out.println("FilterDemo1, Servlet 向客户端请求的响应已拦截");
    }

    @Override
    public void destroy() {
        System.out.println("FilterDemo1 destroy 被调用");
    }
}
