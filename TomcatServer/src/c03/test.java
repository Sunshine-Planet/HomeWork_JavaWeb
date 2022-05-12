package c03;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test {

    public static void main(String[] args) {


        String driver = "org.mariadb.jdbc.Driver";
        String url = "jdbc:mariadb://localhost:3306/db?useSLL=false&serverTimezone=GMT";
        String user = "root";
        String pass = "password";

        String sql = "select * from user";


        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id") + "; name: " + rs.getString("name") + "; sex: " + rs.getString("sex"));
            }
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
