package c19.dao.proxy;

import c18.dbc.DatabaseConnection;
import c19.dao.IUserDAO;
import c19.dao.impl.UserDAOImpl;
import c19.vo.User;

import java.sql.SQLException;

public class UserDAOProxy implements IUserDAO {
    private DatabaseConnection db = null;
    private IUserDAO dao = null;

    public UserDAOProxy() throws Exception {
        this.db = new DatabaseConnection();
        this.dao = new UserDAOImpl(this.db.getConnection());
    }

    @Override
    public boolean findLogin(User user) throws Exception {
        boolean flag = false;
        try {
            flag = this.dao.findLogin(user);
        }catch (Exception e){
            throw e;
        }finally {
            this.db.close();
        }
        return flag;
    }
}
