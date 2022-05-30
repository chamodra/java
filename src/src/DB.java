
package src;

import java.sql.*;
public class DB {
    static Connection con = null;
    
    public static Connection getConnection(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","virajini","virajini@123456789");
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
