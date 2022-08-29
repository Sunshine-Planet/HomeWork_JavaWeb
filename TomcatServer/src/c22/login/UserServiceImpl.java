package c22.login;

public class UserServiceImpl implements UserService{
    private UserLoginDao userLoginDao;

    public void setUserLoginDao(UserLoginDao userLoginDao) {
        this.userLoginDao = userLoginDao;
    }

    @Override
    public boolean login(String name, String password) {

        return userLoginDao.login(name, password);
    }
}
