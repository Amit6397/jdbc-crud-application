package com.sunglowsys.insertRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertrecod {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunglowsys","root","root");


            //create query for insert record

            String q = "insert into school(firstName,lastName,email,mobile)values(?,?,?,?)";
            PreparedStatement pstmt = connection.prepareStatement(q);
            pstmt.setString(1,"shiva");
            pstmt.setString(2,"inter collage");
            pstmt.setString(3,"amit@gmail.com");
            pstmt.setInt(4,566252515);

            pstmt.executeUpdate();
            System.out.println("record inserted............ ");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
