package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection(URl,Username,Password)
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");

		System.out.println("Connection Established...");
		
		//create the statement
		 Statement st = con.createStatement();
		 st.execute("CREATE DATABASE School");
		 System.out.println("DataBase Created Successfully!!!");
		 
		 //Closing the connection
		 con.close();

	}

}
