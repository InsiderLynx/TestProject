package com.testproject;

import java.net.StandardSocketOptions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public class Main {
        private Connection get_Db_Connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jbdc:mysql://localhost:3306/testdb","root","");
            System.out.println("Database is connected");
        }
        catch (ClassNotFoundException ce){
            System.out.println(ce.getMessage());
        }
        catch (SQLException se){
            se.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;
        }
        public static void main(String[]args){
            Main m = new Main();
            Connection con = m.get_Db_Connection();
            try{
                con.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
