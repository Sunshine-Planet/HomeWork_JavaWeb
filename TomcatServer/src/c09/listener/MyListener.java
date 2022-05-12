package c09.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MyListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext 对象已创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext 对象已销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("ServletRequest 对象已创建");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("ServletRequest 对象已销毁");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("HttpSession 对象已创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("HttpSession 对象已销毁");
    }
}
