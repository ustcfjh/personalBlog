package com.jiahui.personalsite.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSite {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8","root","Sx6215106..");
            Statement s = c.createStatement();
        ){
            for(int i=1;i<=5;i++){
                String sqlFormat = "insert into category values(null,'测试分类%d')";
                String sql = String.format(sqlFormat,i);
                s.execute(sql);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
