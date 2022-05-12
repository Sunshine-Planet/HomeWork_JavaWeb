package c08.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoDao {
    DBUtil dbUtil = new DBUtil();
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public int loginByUsernameAndUserpwd(String username, String pwd) throws SQLException, ClassNotFoundException {
        int result = 0;
        connection = dbUtil.getConnection();
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, pwd);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            result = resultSet.getInt(1);
        }
        dbUtil.closeDBResourse(connection, preparedStatement, resultSet);
        return result;
    }
}
