package c08.biz;

import c08.entity.UserInfo;

import java.sql.SQLException;

public interface UserInfoBiz {

    String login(String username, String pwd) throws SQLException, ClassNotFoundException;
    UserInfo getByName(String name);
}
