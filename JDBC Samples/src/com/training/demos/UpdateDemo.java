package com.training.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/trialdb";
		String username="root";
		String password="root";
		Connection connection=null;
		Statement statement=null;
		try {
			connection=DriverManager.getConnection(url, username, password);
			statement=connection.createStatement();
			String sql="update policy set type = 'vehicle' where policy_id=20 ";
			int result=statement.executeUpdate(sql);
			System.out.println("Updated "+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(connection!=null)
					connection.close();
				if(statement!=null)
					statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
