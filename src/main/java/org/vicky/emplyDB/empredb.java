package org.vicky.emplyDB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class empredb {

	public static void main(String[] args) throws SQLException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("employeeid");
			int emp_id = Integer.parseInt(br.readLine());
			System.out.println("employee name");
			String emp_name = br.readLine();
			
		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/emp104db","sa","");
         String str = "insert into emp values(?,?)";
         PreparedStatement pr = con.prepareStatement(str);
         pr.setInt(1, emp_id);
         pr.setString(2,emp_name);
		 pr.execute();
		 ResultSet rs = pr.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+""+rs.getString(2));
		}
		rs.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
	}

}
