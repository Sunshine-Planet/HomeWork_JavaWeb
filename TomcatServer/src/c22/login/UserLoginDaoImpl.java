package c22.login;

public class UserLoginDaoImpl implements UserLoginDao{
    @Override
    public boolean login(String name, String password) {
        boolean flag = false;
        if ("zhangsan".equals(name) && "123456".equals(password)) {
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }
}
