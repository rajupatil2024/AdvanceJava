package jdbc_company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EstablishConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
				//Load and Register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Establish the connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");

				System.out.println("Connection Established...");
				 Statement st = con.createStatement();
				 st.executeUpdate("CREATE DATABASE COMPANY");
				 System.out.println("DataBase Created Successfully!!!");
				 con.close();

	}

}
