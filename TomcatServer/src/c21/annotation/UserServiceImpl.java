package c21.annotation;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource(name = "userDao")
    private UserDao userDao;
    @Override
    public void show() {
        this.userDao.show();
        System.out.println("userService ... show");
    }
}
