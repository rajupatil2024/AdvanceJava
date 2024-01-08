package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//load and register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Establish the connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "root");

				System.out.println("Connection Established...");
				
				//create the statement	
				 Statement st = con.createStatement();
				 st.executeUpdate("update student set id='05' where name='Raju'");
				 st.executeUpdate("update student set address='Devanahalli' where name='Tarun'");
				 st.executeUpdate("update student set id='9' where address='Devanahalli'");
				 
				 //Close the connection
				 con.close();

	}

}
