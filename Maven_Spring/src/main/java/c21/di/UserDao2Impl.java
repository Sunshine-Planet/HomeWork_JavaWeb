package c21.di;

import c20.ioc.UserDao;

public class UserDao2Impl implements UserDao2{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void show2() {
        this.userDao.show();
        System.out.println("userDao2 OutPut, 依赖注入的实现");
    }
}
