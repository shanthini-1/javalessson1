package com.chainsys.jdbcprogram;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class emp_db {
  public static void main(String[] args) {
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection myConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Chennai268$");
        Statement stmt = myConn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Employees ");
        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4)+ " " +rs.getString(5));
      //      System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4)+ " " +rs.getString(5));
            myConn.close();
        }
    }catch(Exception err) {
        System.out.println(err.getMessage());
    }
}
}