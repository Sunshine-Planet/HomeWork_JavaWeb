package c19.dao.impl;

import c19.dao.IUserDAO;
import c19.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements IUserDAO {
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    public UserDAOImpl(Connection conn){
        this.conn = conn;
    }

    @Override
    public boolean findLogin(User user) throws SQLException {
        boolean flag = false;
        String sql = "SELECT name FROM user WHERE userid = ? AND password = ?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1, user.getUserid());
        this.pstmt.setString(2, user.getPassword());
        ResultSet rs = this.pstmt.executeQuery();
        if (rs.next())
        {
            user.setName(rs.getString(1));
            flag = true;
        }
        this.pstmt.close();
        return flag;
    }
}
