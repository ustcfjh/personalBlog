package com.jiahui.personalsite.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestSite {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/")){

        }
    }
}
