/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 * 
 * @author dell
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
public class JavaApplication1 {
    
    
    
    public static Statement connection(){
         Connection con;
         Statement st = null;
        try{
            con = DriverManager.getConnection("jdbc:sqlite:cricketdatabase.db");
            st = con.createStatement();
            System.out.print("Connection Successful");
        }
        catch(Exception e){
            System.out.print("Connection Unsuccessful");
        }
        return st;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        connection();
    }
    
}
