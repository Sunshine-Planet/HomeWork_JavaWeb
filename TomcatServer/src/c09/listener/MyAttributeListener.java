package c09.listener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

public class MyAttributeListener implements ServletContextAttributeListener, HttpSessionAttributeListener, ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        System.out.println("ServletContext 添加属性： " + name + "=" +scae.getServletContext().getAttribute(name));
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        System.out.println("ServletContext 移除属性： " + name );
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        System.out.println("ServletContext 替换属性： " + name + "=" + scae.getServletContext().getAttribute(name));
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("ServletRequest 添加属性： " + name + "=" + srae.getServletRequest().getAttribute(name));
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("ServletRequest 移除属性： " + name);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("ServletRequest 替换属性： " + name + "=" + srae.getServletRequest().getAttribute(name));
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        String name = se.getName();
        System.out.println("HttpSession 添加属性： " + name + "=" + se.getSession().getAttribute(name));
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        String name = se.getName();
        System.out.println("HttpSession 移除属性： " + name);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        String name = se.getName();
        System.out.println("HttpSession 替换属性： " + name + "=" + se.getSession().getAttribute(name));
    }
}
