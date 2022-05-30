package c21.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserDao2 userDao2 = (UserDao2) applicationContext.getBean("userDao2");
        userDao2.show2();
    }
}
