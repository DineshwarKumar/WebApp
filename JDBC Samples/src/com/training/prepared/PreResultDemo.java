package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreResultDemo {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/trialdb";
		String username="root";
		String password="root";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		try {
			connection=DriverManager.getConnection(url, username, password);
			String type1="Veg";
			String sql="select * from food where type=?";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, "Veg");;
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				String name=resultSet.getString("name");
				int foodId=resultSet.getInt("food_id");
				String type=resultSet.getString("type");
				float cost=resultSet.getFloat("cost");
				System.out.println(name+"\t"+foodId+"\t"+type+"\t"+cost);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(connection!=null)
					connection.close();
				if(preparedStatement!=null)
					preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
