/**
 * 
 */
package com.sk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Abridge Soultions
 *
 */
public class JDBCConnector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mariadb://localhost:3306/sush?","root","password");
			System.out.println("connection established");
			Statement st =con.createStatement();
			ResultSet rs =st.executeQuery("select * from dept");
			while(rs.next()) {
				System.out.println(rs.getString(2) + rs.getString(1));
			}
			ResultSetMetadata rm
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
