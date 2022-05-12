package c03;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class MariaDBDemo {

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        ResultSet rs = null;
        Statement statement = null;
        String sql;

        String url = "";
        String user = "root";
        String password = "password";

        try {

            System.out.println("1.动态加载MariaDB驱动");
            Class.forName("org.mariadb.jdbc.Driver");

            // Mariadb的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
            // 避免中文乱码要指定useUnicode和characterEncoding
            System.out.println("2.构建URL");
            url = "jdbc:mariadb://localhost:3306/db?"
                    + "useUnicode=true&characterEncoding=UTF8";

            System.out.println("3.通过URL取得数据链接");
            // 一个Connection代表一个数据库连接
            conn = DriverManager.getConnection(url, user, password);

            // Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等
            statement = conn.createStatement();

            sql = "SELECT * FROM user";
            System.out.println("4.通过Statement执行SQL语句,返回ResultSet结果集");
            rs = statement.executeQuery(sql);// executeQuery会返回结果的集合，否则返回空值

            System.out.println("5.循环遍历结果集");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2)
                        + "\t" + rs.getString(3) + "\t" + rs.getString(4));// 入如果返回的是int类型可以用getInt()
            }

        } catch (SQLException e) {
            System.out.println("MariaDB操作错误");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭结果集,数据链接
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    if (statement != null) {
                        try {
                            statement.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } finally {
                            if (conn != null) {
                                try {
                                    conn.close();
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
