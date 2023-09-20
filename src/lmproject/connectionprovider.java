
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lmproject;
import java.sql.*;

/**
 *
 * @author haris
 */
public class connectionprovider {
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lm","root","Hari$h007");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
