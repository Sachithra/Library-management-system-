/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BookReturnNote {
     Connection con;
     PreparedStatement pst;
     ResultSet rs;

    public void BooksReturn(int bookid, String bookname, String returnbook) {
        con=DBConnectionClass.connection();
         
         String sql="INSERT INTO `returnbook`(`bookid`, `bookname`, `returnbook`) VALUES (?,?,?)";
      
        try{
            pst=con.prepareStatement(sql);
            pst.setInt(1,bookid);
            pst.setString(2,bookname);
            pst.setString(3, returnbook);
          
            pst.executeUpdate();
            
            
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"DB Connection Error"
           +ex.getMessage()
          ,"ERROR",JOptionPane.ERROR_MESSAGE);      
        }
    }

}
