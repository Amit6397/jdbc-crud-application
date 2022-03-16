package com.sunglowsys.createTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createTab {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url= "jdbc:mysql://localhost:3306/sunglowsys";
            String username="root";
            String password="root";

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String q="create table student5(id int primary key auto_increment,firstname varchar(20) not null,lastname varchar(20),email varchar(20),mobile int)";
            statement.executeUpdate(q);
            System.out.println("table is created.....");
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
