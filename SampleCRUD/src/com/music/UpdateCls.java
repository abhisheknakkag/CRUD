package com.music;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateCls {

	public static void main(String[] args) throws ClassNotFoundException {
		try
		{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:~/musicstoredb","sa","");
			Statement stmt=con.createStatement();
			String str="update Category set categoryid='D003'where categoryid='D002'";
			int x=stmt.executeUpdate(str);
			if(x>0)
			{
				System.out.println("Row updated");
			}
			else
			{
				System.out.println("Row not updated");
			}
		}
			catch(SQLException ex)
			{
				System.out.println("Connection Failed"+ex.getMessage());
			}

		}
}

	
