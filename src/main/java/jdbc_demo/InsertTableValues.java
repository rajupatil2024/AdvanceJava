package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//load and register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Establish the connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "root");

				System.out.println("Connection Established...");
				
				//create the statement
				 Statement st = con.createStatement();
				 st.executeUpdate("insert into student values (102,'Raju','Mudhol')");
				 st.executeUpdate("insert into student values (103,'Akash','Bagalkote')");
				 st.executeUpdate("insert into student values (104,'Tarun','Hebbal Flyover')");
				 con.close();	
	}
}
