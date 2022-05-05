/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author dell
 */
public class connect {
    private static Connection con;
    private static Statement st;
    private static PreparedStatement pst;
    public static Statement connection(){
         
        try{
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:cricketdatabase.db");
            st = con.createStatement();
            System.out.print("Connection Successful");
        }
        catch(Exception e){
            System.out.print("Connection Unsuccessful");
        }
        return st;
    }
   
   
   
}
