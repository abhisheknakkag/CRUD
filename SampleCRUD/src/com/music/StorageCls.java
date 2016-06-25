package com.music;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StorageCls {

	public static void main(String[] args) throws ClassNotFoundException {
		try
		{
			Class.forName("org.h2.Driver");//loading of the driver
			Connection con=DriverManager.getConnection("jdbc:h2:~/musicstoredb","sa","");
			Statement stmt=con.createStatement();
			String query="insert into Category values('G002','Guitar','This is Guitar' )";
			
			int x=stmt.executeUpdate(query);
			if(x>0)
			{
				System.out.println("Row inserted");
				
			}
			else
			{
				System.out.println("Row not inserted");
			}
			
		}
		catch(SQLException ex)
		{
			System.out.println("Connection Failed"+ex.getMessage());
		}

	}

}
