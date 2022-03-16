package com.sunglowsys.insertRecordScaner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertRecordSca {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunglowsys","root","root");

            String q = "insert into school(firstname,lastname,email,mobile) values(?,?,?,?)";

            PreparedStatement psmt = connection.prepareStatement(q);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("plese enter SchfirstName");
            String SchfirstName = reader.readLine();

            System.out.println("plese enter SchlastName");
            String SchlastName = reader.readLine();

            System.out.println("plese enter  Schemail");
            String Schemail = reader.readLine();

            System.out.println("plese enter Schmobile");
            String Schmobile = reader.readLine();

            psmt.setString(1,SchfirstName);
            psmt.setString(2,SchlastName);
            psmt.setString(3,Schemail);
            psmt.setInt(4, Integer.parseInt(Schmobile));


            psmt.executeUpdate();
            System.out.println("inserted");
            connection.close();



        }catch (Exception  e){
            e.printStackTrace();
        }
    }
}
