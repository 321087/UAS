package Config;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection(){
        if(conn==null){
            try {
                String url = "jdbc:mysql://localhost:3306/belajar";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(url,user, pass);
            } catch (Exception e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return conn;
    }
}
