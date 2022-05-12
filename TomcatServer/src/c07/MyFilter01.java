package c07;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter01 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out=servletResponse.getWriter();
        out.println("Hello from MyFilter01<br>");
        filterChain.doFilter(servletRequest, servletResponse);
        out.println("MyFilter01 after<br>");
    }
}
