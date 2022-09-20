package com.chainsys.jdbcprogram;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Stored_dB {
	public static void main(String[] args) {
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"Chennai268$");
			PreparedStatement ps = myCon.prepareStatement("insert into kjds values(?,?)");//? positioned parameter like a variable
			File f = new File("d:\\temp\\sample.txt");
			FileReader fr = new FileReader(f);
			ps.setInt(1, 101);
			ps.setString(2, "Shanthini");
			int i = ps.executeUpdate();//it will use the connection and execute the insert statement
			//this is used to save the data in db .if it is not given then last inserted values only updated.
			ps.setInt(1, 102);
			ps.setCharacterStream(2, fr,(int)f.length());
			int j = ps.executeUpdate();
			System.out.println(i+j + " " + "record affected");
			myCon.close();
		} catch (Exception err) {
			err.printStackTrace();// yes sir yes sir
			
			
		}
	}
}

/*
package com.chainsys.jdbc;
java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class stored_DB {
   public static void main(String[] args) {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Dharani@109");
          PreparedStatement ps = myCon.prepareStatement("insert into Fish values(?,?)");
          File f = new File("D:\\temp\\Beast.txt");
          FileReader fr = new FileReader(f);
          ps.setInt(1, 101);
          ps.setString(2, "leela");
          int i = ps.executeUpdate();
          ps.setInt(1, 102);
          ps.setCharacterStream(2, fr,(int)f.length());
          int j = ps.executeUpdate();
          int k=i+j;
          System.out.println(k + " " + "record affected");
          myCon.close();
      }catch(Exception err) {
          err.printStackTrace();
      }
}
}
*/
