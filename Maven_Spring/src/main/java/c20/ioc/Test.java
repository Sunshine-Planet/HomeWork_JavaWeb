package c20.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //初始化 Spring 容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");

        //通过 Spring 容器获取 userDao 实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.show();
    }
}
