package com.chainsys.sample_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
 
/**
 * This program demonstrates how to make database connection with Oracle
 * database server.
 * @author shan3102
 * date : may 6 2022
 *
 */

/*
 * With JDBC, Different ways to establishing a database connection 
 * by calling the method getConnection() of the DriverManager class. 
 * There are three versions of this method:
 * static Connection getConnection(String url)
 * static Connection getConnection(String url, Properties info)
 * static Connection getConnection(String url, String user, String password)
 */
public class connectiondb {
		 
	    public static void main(String[] args) {
	 
	        Connection conn1 = null;
	        Connection conn2 = null;
	        Connection conn3 = null;
	 
	        try {
	            // registers Oracle JDBC driver - though this is no longer required
	            // since JDBC 4.0, but added here for backward compatibility
	            Class.forName("oracle.jdbc.OracleDriver");
	 
	            // METHOD #1
	            String dbURL1 = "jdbc:oracle:thin:tiger/scott@localhost:1521:productDB";
	            conn1 = DriverManager.getConnection(dbURL1);
	            if (conn1 != null) {
	                System.out.println("Connected with connection #1");
	            }
	 
	            // METHOD #2
	            String dbURL2 = "jdbc:oracle:thin:@localhost:1521:productDB";
	            String username = "tiger";
	            String password = "scott";
	            conn2 = DriverManager.getConnection(dbURL2, username, password);
	            if (conn2 != null) {
	                System.out.println("Connected with connection #2");
	            }
	 
	            // METHOD #3
	            String dbURL3 = "jdbc:oracle:oci:@ProductDB";
	            Properties properties = new Properties();
	            properties.put("user", "tiger");
	            properties.put("password", "scott");
	            properties.put("defaultRowPrefetch", "20");
	            conn3 = DriverManager.getConnection(dbURL3, properties);
	 
	            if (conn3 != null) {
	                System.out.println("Connected with connection #3");
	            }
	        } catch (ClassNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (conn1 != null && !conn1.isClosed()) {
	                    conn1.close();
	                }
	                if (conn2 != null && !conn2.isClosed()) {
	                    conn2.close();
	                }
	                if (conn3 != null && !conn3.isClosed()) {
	                    conn3.close();
	                }
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
	}


