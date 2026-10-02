 package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection conn;
    Statement s ;
    
    public Conn() {
        try {
            
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root",  "root");
            System.out.println("connected successfully");
            s = conn.createStatement();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    
    
}
