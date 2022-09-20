package com.chainsys.jdbcprogram;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstJdbc {

    public static void main(String[] args) {
        try {
            Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Chennai268$");
            Statement mystat = myCon.createStatement();
            ResultSet myRs = mystat.executeQuery("select * from employees");
            while (myRs.next()) {
                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
            }
            myCon.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}