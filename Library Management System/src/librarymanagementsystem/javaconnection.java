/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package librarymanagementsystem;

/**
 *
 * @author Mehreen_Najm
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnection {

 Connection conn;

 public static Connection ConnecrDb(){
      try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Mehreen_Najm\\Documents\\NetBeansProjects\\Library Management System\\library_db.sqlite");
        return conn;

    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;




    }



 }






 

}
