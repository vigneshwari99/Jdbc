package org.vicky.emplyDB;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class empdb {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
		

		try {
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/emp104db","sa","");
			String str =  "insert into data(id , name) values (12 , 'asdf'),(13 , 'loppo'),(14 , 'kitu')";
			
			Statement st = conn.createStatement();
			st.execute(str);
			System.out.println("succ");
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



	}

}
