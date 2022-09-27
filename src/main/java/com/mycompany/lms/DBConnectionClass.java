/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class DBConnectionClass {
    

    
      static Connection connection()
    {
        try
        {
          
          
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/libary_ms","root",""); 
          return con; 
        }
        catch(Exception e)
                {
                    System.out.println(e);
                    return null;
                }
        
    }
      
    
    
  
}
