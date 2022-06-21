package com.utility;

import java.sql.*;
public class DBConnection {
	public  Connection con=null;
	public Statement st=null;
	public  PreparedStatement st1=null;
	
//Connect to Databse
     public DBConnection()throws ClassNotFoundException, SQLException
    {
         try {
        	
        	 Class.forName("oracle.jdbc.driver.OracleDriver");
        	 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","ruved");
     		System.out.println("connection success");

        } catch (Exception ex) {
           System.out.println(ex);
        } 
    }
     public static void main(String[] args) {
 		System.out.println("DBConnection.con.getAutoCommit()");
 	}
}

