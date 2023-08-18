package com.java.jdbc;


import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
 
public class JDBC { 
 
    public static Connection getConnection() {         
        Connection connection = null;         
		 
        try {             
            // Load the database driver for MySQL.             
            Class.forName("com.mysql.cj.jdbc.Driver"); 
 
            // Set database connection parameters.  
            String url = ("jdbc:mysql://localhost:3306/school"); 
            String username = ("root");  
            String password = ("root");             
             
            // Create the database connection.             
            connection = DriverManager.getConnection(url, username, password);                                                     
        }  
        catch (ClassNotFoundException | SQLException ex) {              
            ex.printStackTrace();           
        } 
        return connection; 
    } 
}  