package c19.dao;

import c19.vo.User;

import java.sql.SQLException;

public interface IUserDAO {
    public boolean findLogin(User user) throws Exception;

}
