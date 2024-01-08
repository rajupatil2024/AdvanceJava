package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "root");
		
		//create the statement
		 Statement st = con.createStatement();
		 
		 st.execute("create table student(id integer,name varchar(25),address varchar(25))");
		 con.close();
	}
}
