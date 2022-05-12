package c08.db;

import java.sql.*;
public class DBUtil {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        String driver = "org.mariadb.jdbc.Driver";
        String url = "jdbc:mariadb://localhost:3306/mydb1?useSLL=false&serverTimezone=GMT";
        String user = "root";
        String pass = "password";

        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, pass);
        return conn;

    }

    public void closeDBResourse(Connection conn, PreparedStatement pstat, ResultSet rs) throws SQLException {
        if (rs != null){
            rs.close();
        }
        if (pstat != null){
            pstat.close();
        }
        if (conn != null){
            conn.close();
        }
    }
}
