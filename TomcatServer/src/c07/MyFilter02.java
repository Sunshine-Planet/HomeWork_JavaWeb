package c07;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter02 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out=servletResponse.getWriter();
        out.println("MyFilter02 before<br>");
        filterChain.doFilter(servletRequest, servletResponse);
        out.println("MyFilter02 after<br>");
    }
}
