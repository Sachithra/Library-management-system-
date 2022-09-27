/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lms;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class issueBookClass {
    
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    
    
  public void IssueBook(String date,String bookname,String stname,int issueid,int bookid){
      con=DBConnectionClass.connection();
      
      String sqlInsert=" INSERT INTO `issuenote`(`issuedate`, `bookname`, `studentname`, `issueid`, `bookid`) VALUES (?,?,?,?,?)";
      try{
          
        
        
          pst=con.prepareStatement(sqlInsert);
          pst.setString(1, date);
          pst.setString(2, bookname);
          pst.setString(3, stname);
          pst.setInt(4, issueid);
          pst.setInt(5, bookid);
          
          pst.executeUpdate();
          
          
          
      }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"DB Connection Error"+ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
      }
      
      
  }

  

}
