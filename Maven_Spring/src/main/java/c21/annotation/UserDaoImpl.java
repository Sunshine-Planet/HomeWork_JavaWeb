package c21.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

    @Override
    public void show() {
        System.out.println("UserDao注解 ... show()");
    }
}
