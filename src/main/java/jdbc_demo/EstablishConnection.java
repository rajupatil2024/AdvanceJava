package jdbc_demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EstablishConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load and Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");

		System.out.println("Connection Established...");
		 Statement st = con.createStatement();
		 st.executeUpdate("CREATE DATABASE STUDENT");
		 System.out.println("DataBase Created Successfully!!!");
		 con.close();
		
	}
}
//st.executeUpdate("CREATE TABLE STUDENT");
//st.executeUpdate("INSERT INTO STUDENT VALUES(STD_ID INTEGER, STD_NAME VARCHAR(20),STD_ADDRESS VARCHAR(20))");