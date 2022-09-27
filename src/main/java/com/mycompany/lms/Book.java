/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lms;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Book {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
   
    
    public void Books(int bookid, String bookname,String title, String returnbook){
       con=DBConnectionClass.connection();
       
       String sql="INSERT INTO `books`(`bookid`, `bookname`, tital, `returnbook`) VALUES (?,?,?,?)";
       
        
  
        if(title==" "){
            
             try{
           pst=con.prepareStatement(sql);
           
          
           
           pst.setInt(1 , bookid);
           pst.setString(2, bookname); 
           pst.setString(3, title); 
           pst.setString(4, returnbook);
           
           pst.executeUpdate();
       
           
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"DB Connection Error"+ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
       }   
        }else{
           JOptionPane.showMessageDialog(null, "Not Working");
        }
       
      
    }

        
    

}
