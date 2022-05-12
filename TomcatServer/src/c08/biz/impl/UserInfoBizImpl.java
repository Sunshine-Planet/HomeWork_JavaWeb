package c08.biz.impl;

import c08.biz.UserInfoBiz;
import c08.db.UserInfoDao;
import c08.entity.UserInfo;

import java.sql.SQLException;

public class UserInfoBizImpl implements UserInfoBiz {
    UserInfoDao userInfoDao = new UserInfoDao();

    @Override
    public String login(String username, String pwd) throws SQLException, ClassNotFoundException {
        String message = null;
        int result = 0;
        if ((result = userInfoDao.loginByUsernameAndUserpwd(username, pwd)) > 0){
            message = "登录成功！";
        }else {
            message = "用户名或密码错误";
        }
        return message;
    }

    @Override
    public UserInfo getByName(String name) {
        UserInfo user = new UserInfo();
        user.setuserName(name);
        return user;
    }
}
