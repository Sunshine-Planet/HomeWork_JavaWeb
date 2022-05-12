package c18.dbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String DBDRIVER = "org.mariadb.jdbc.Driver";
    private static final String DBURL = "jdbc:mariadb://localhost:3306/smile";
    private static final String DBUSER = "root";
    private static final String DBPASSWORD = "password";
    private Connection conn;
    public DatabaseConnection() throws Exception{
        Class.forName(DBDRIVER);
        this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
    }
    public Connection getConnection(){
        return this.conn;
    }
    public void close() throws Exception{
        if (this.conn != null){
            try{
                this.conn.close();
            }catch (Exception e){
                throw e;
            }
        }
    }
}
