package com.sunglowsys.insertRecordStu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class insertStudent {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunglowsys","root","root");
            Statement statement=connection.createStatement();
            String q= "create table student7(id int primary key auto_increment,firstName varchar(20) not null,lastName varchar(20),email varchar(20),mobile int(20))";
            String a="insert into student7(firstName,lastName,email,mobile) values(?,?,?,?)";

            PreparedStatement psmt = connection.prepareStatement(a);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("plz enter input");
            String stufirstName = reader.readLine();

            System.out.println("plz enter input");
            String stulastName = reader.readLine();

            System.out.println("plz enter input");
            String stuemail = reader.readLine();

            System.out.println("plz enter input");
            String stumobile = reader.readLine();

            psmt.setString(1,stufirstName);
            psmt.setString(2,stulastName);
            psmt.setString(3,stuemail);
            psmt.setInt(4, Integer.parseInt(stumobile));
           /* psmt.setString(1,"bhole");
            psmt.setString(2,"kashyap");
            psmt.setString(3,"bhole698@gmail.com");
            psmt.setInt(4,566551155);*/


            statement.executeUpdate(q);
            psmt.executeUpdate();
            System.out.println("insert record");
            connection.close();
        }catch (Exception  e){
            e.printStackTrace();
        }
    }
}
