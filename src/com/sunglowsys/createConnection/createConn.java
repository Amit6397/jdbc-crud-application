package com.sunglowsys.createConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class createConn {
    public static void main(String[] args) {
        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection

            String url = "jdbc:mysql://localhost:3306/sunglowsys";
            String username = "root";
            String password = "root";

            Connection  connection = DriverManager.getConnection(url,username,password);
            if(connection.isClosed()){
                System.out.println("connection is closed");
            }else {
                System.out.println("connection is created");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
