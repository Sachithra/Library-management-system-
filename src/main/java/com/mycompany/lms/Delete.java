/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lms;
import java.sql.*;

public class Delete {
 
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    public void DeleteWithIssue(int bookid){
        con=DBConnectionClass.connection();
        
        
        String sql="DELETE FROM `books` WHERE bookid=?";
        
        try{
        
           pst=con.prepareStatement(sql);
           pst.setInt(1,bookid );
       //  pst.setString(2, bookname);
           
           pst.executeUpdate();
            
            
        }catch(Exception ex){
        
    }
        
        
  }
 
}
