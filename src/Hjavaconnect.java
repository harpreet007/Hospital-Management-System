
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harpreet
 */
public class Hjavaconnect {
    Connection conn;
    public static Connection connecrDb(){
        try{
        Class.forName("org.sqlite.JDBC");
          Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\harpreet\\Documents\\NetBeansProjects\\Hospital_Managgement_System\\Hospital.sqlite");
          return conn;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    }
