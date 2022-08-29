package c22.login;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLogin {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) applicationContext.getBean("userService");
        boolean flag = userService.login("zhangsan", "123456");
        if (flag){
            System.out.println("登录成功");
        }else {
            System.out.println("用户名或密码错误");
        }
    }
}
